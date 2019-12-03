package com.aljammal.printercmd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.aljammal.printer.PrintData.BluetoothAddress;
import com.aljammal.printer.PrintData.ConnectionsPrinter;
import com.aljammal.printer.PrintData.PrintData;
import com.aljammal.printer.Printers.Honeywell_RP4;
import com.aljammal.printer.Printers.Printer;

public class MainActivity extends AppCompatActivity {
    private ConnectionsPrinter bluetoothConnection;
    private PrintData printData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bluetoothConnection = new BluetoothAddress("0010203BB69C");

        printData = new PrintData
                .Builder()
                .setSensorType("R")
                .setLabelWidth("276")
                .setBarcode("552555215421")
                .setXaxisBarcode("0150")
                .setReadableBarcode("0240")
                .setName("Jammal")
                .setHeightName("10")
                .setWidthName("10")
                .setDate("1/7/2019")
                .setPrice("60")
                .setCurrency("US")
                .setPrintCount("1")
                .build();

    }

    public void PrintData(View view) {
        Printer printer = new Honeywell_RP4(bluetoothConnection, printData, MainActivity.this);
        printer.printShelfTag("hi", true);
    }
}
