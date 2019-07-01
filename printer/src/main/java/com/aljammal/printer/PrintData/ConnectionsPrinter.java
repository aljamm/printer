package com.aljammal.printer.PrintData;

import honeywell.connection.ConnectionBase;

public abstract class ConnectionsPrinter {
    public ConnectionBase conn = null;

    public abstract Integer connections(byte[] printData);



    public String formatBluetoothAddress(String bluetoothAddress) {
        //Format MAC address string
        StringBuilder formattedBTAddress = new StringBuilder(bluetoothAddress);
        for (int bluetoothAddressPosition = 2; bluetoothAddressPosition <= formattedBTAddress.length() - 2; bluetoothAddressPosition += 3)
            formattedBTAddress.insert(bluetoothAddressPosition, ":");
        return formattedBTAddress.toString();
    }
}
