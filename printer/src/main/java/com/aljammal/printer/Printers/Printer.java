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

    public PrintData getPrintData() {
        return printData;
    }

    public void setPrintData(PrintData printData) {
        this.printData = printData;
    }

    public Context getmContext() {
        return mContext;
    }

    public void setmContext(Context mContext) {
        this.mContext = mContext;
    }

    public abstract void printShelfTag(String mas, boolean isShowDialog);

    public abstract void printLabel(String mas,boolean isShowDialog);

    public abstract void printLabelBarcode(String Barcode,String mas,boolean isShowDialog);

    public abstract void printSpecialOffer(String mas,boolean isShowDialog);


}
