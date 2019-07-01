package com.aljammal.printer.Task;

import android.content.Context;
import android.os.AsyncTask;


import com.aljammal.printer.PrintData.ConnectionsPrinter;
import com.aljammal.printer.R;
import com.aljammal.printer.Utils.Constants;
import com.aljammal.printer.Utils.ProgressDialogUtil;
import com.aljammal.printer.Utils.ValidationUtility;


import honeywell.connection.ConnectionBase;


public class ExecutePrintCommand extends AsyncTask<Void, Void, Integer> {
    private final Context context;
    private byte[] printData = {0};
    private ConnectionBase conn = null;
    private String waitingDialogMessage;
    private ConnectionsPrinter connectionsPrinter;

    public ExecutePrintCommand(Context context, byte[] printByte, String waitingDialogMessage, ConnectionsPrinter connectionsPrinter) {
        this.context = context;
        this.printData = printByte;
        this.waitingDialogMessage = waitingDialogMessage;
        this.connectionsPrinter = connectionsPrinter;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        if (waitingDialogMessage.isEmpty())
            ProgressDialogUtil.showLoadingDialog(context.getResources().getString(R.string.msg_printing_in_progress), context);
        else
            ProgressDialogUtil.showLoadingDialog(waitingDialogMessage, context);


    }

    @Override
    protected Integer doInBackground(Void... params) {
        int result = connectionsPrinter.connections(printData);
        ProgressDialogUtil.hideLoadingDialog();
        return result;
    }

    @Override
    protected void onPostExecute(Integer result) {
        super.onPostExecute(result);
        switch (result) {
            case Constants.Error_InvalidBarcode:
                ValidationUtility.showErrorDialog(context.getResources().getString(R.string.error_occurred), context.getResources().getString(R.string.validation_scan_barcode), context);

                break;
            case Constants.Error_InvalidPrinterMAC:
                ValidationUtility.showErrorDialog(context.getString(R.string.error_occurred), context.getResources().getString(R.string.validation_check_printer_mac), context);

                break;
            case Constants.Error_PrintingError:
                ValidationUtility.showErrorDialog(context.getString(R.string.error_occurred), context.getResources().getString(R.string.validation_error_occurred_printing), context);

                break;
            case Constants.Error_Invalid_Media:
                ValidationUtility.showErrorDialog(context.getString(R.string.error_occurred), context.getResources().getString(R.string.validation_error_occurred_printing_invalid_media), context);

                break;

        }
    }





}
