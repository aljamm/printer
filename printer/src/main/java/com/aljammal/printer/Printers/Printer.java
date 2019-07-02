package com.aljammal.printer.Printers;

import android.content.Context;

import com.aljammal.printer.PrintData.ConnectionsPrinter;
import com.aljammal.printer.PrintData.PrintData;

public abstract class Printer {

    private ConnectionsPrinter connectionsPrinter;

    private PrintData printData;

    private Context mContext;

    public ConnectionsPrinter getConnectionsPrinter() {
        return connectionsPrinter;
    }

    void setConnectionsPrinter(ConnectionsPrinter connectionsPrinter) {
        this.connectionsPrinter = connectionsPrinter;
    }

     PrintData getPrintData() {
        return printData;
    }

     void setPrintData(PrintData printData) {
        this.printData = printData;
    }

     Context getContext() {
        return mContext;
    }

     void setContext(Context mContext) {
        this.mContext = mContext;
    }

    public abstract void printShelfTag(String mas, boolean isShowDialog);

    public abstract void printLabel(String mas,boolean isShowDialog);

    public abstract void printLabelBarcode(String Barcode,String mas,boolean isShowDialog);

    public abstract void printSpecialOffer(String mas,boolean isShowDialog);


}
