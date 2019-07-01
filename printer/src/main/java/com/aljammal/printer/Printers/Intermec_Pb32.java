package com.aljammal.printer.Printers;

import com.aljammal.printer.PrintData.ConnectionsPrinter;

public class Intermec_Pb32 extends Printer {

    public Intermec_Pb32(ConnectionsPrinter connectionsPrinter) {
        setConnectionsPrinter(connectionsPrinter);
    }

    @Override
    public void printShelfTag(String mas,boolean isShowDialog) {

    }

    @Override
    public void printLabel(String mas,boolean isShowDialog) {

    }

    @Override
    public void printLabelBarcode(String Barcode,String mas,boolean isShowDialog) {

    }

    @Override
    public void printSpecialOffer(String mas,boolean isShowDialog) {

    }
}
