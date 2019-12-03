package com.aljammal.printer.Printers;

import android.content.Context;

import com.aljammal.printer.PrintData.ConnectionsPrinter;
import com.aljammal.printer.PrintData.PrintData;
import com.aljammal.printer.Task.ExecutePrintCommand;

public class Honeywell_RP4 extends Printer {

    public Honeywell_RP4(ConnectionsPrinter connectionsPrinter, PrintData printData, Context mContext) {
        setConnectionsPrinter(connectionsPrinter);
        setPrintData(printData);
        setContext(mContext);
    }

    @Override
    public void printShelfTag(String mas, boolean isShowDialog) {

        new ExecutePrintCommand(getContext(), LabelGenerationUtil2.GenerateShelfTagLabelHoneywell_RP4(getPrintData()), mas, getConnectionsPrinter()).execute();

    }

    @Override
    public void printLabel(String mas, boolean isShowDialog) {

    }

    @Override
    public void printLabelBarcode(String Barcode, String mas, boolean isShowDialog) {

    }

    @Override
    public void printSpecialOffer(String mas, boolean isShowDialog) {

    }
}
