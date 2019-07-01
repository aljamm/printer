package com.aljammal.printer.PrintData;

import com.aljammal.printer.Utils.Constants;

import java.io.IOException;
import java.util.Locale;

import honeywell.connection.Connection_Bluetooth;

public class BluetoothAddress extends ConnectionsPrinter {

    private String bluetoothAddress;

    public BluetoothAddress(String bluetoothAddress) {
        this.bluetoothAddress = bluetoothAddress;

    }

    @Override
    public Integer connections(byte[] printData) {

        if (bluetoothAddress.equals("")) {
            return (Constants.Error_InvalidPrinterMAC);
        }

        bluetoothAddress = bluetoothAddress.toUpperCase(Locale.US);
        if (!bluetoothAddress.matches("[0-9A-fa-f:]{17}")) {
            bluetoothAddress = formatBluetoothAddress(bluetoothAddress);
        }


        try {
            conn = Connection_Bluetooth.createClient(bluetoothAddress, false);
        } catch (Exception e) {
            return Constants.Error_InvalidPrinterMAC;
        }


        boolean connected = false;
        for (int i = 1; i < 6; i++) {
            if (!conn.getIsOpen()) {
                try {
                    conn.open();
                    connected = true;
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        if (!connected) {
            return Constants.Error_PrintingError;
        }

        if (!conn.getIsOpen()) {
            try {
                conn.open();
            } catch (Exception e) {
                conn.close();
                return (Constants.Error_PrintingError);
            }
        }
        try {
            conn.clearWriteBuffer();
            int bytesWritten = 0;
            int bytesToWrite = 1024;
            int totalBytes = printData.length;
            int remainingBytes = totalBytes;
            while (bytesWritten < totalBytes) {
                if (remainingBytes < bytesToWrite)
                    bytesToWrite = remainingBytes;
                //Send data, 1024 bytes at a time until all data sent
                conn.write(printData, bytesWritten, bytesToWrite);
                bytesWritten += bytesToWrite;
                remainingBytes = remainingBytes - bytesToWrite;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            conn.clearWriteBuffer();
            conn.close();
            return Constants.Success_PrintingDone;
        } catch (Exception e) {
            return Constants.Error_PrintingError;
        }


    }
}
