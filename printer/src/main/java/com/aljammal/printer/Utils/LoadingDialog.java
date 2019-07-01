package com.aljammal.printer.Utils;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

import com.aljammal.printer.R;


public class LoadingDialog extends ProgressDialog {
    private static String Message;

    public static ProgressDialog inIt(Context context, String message) {
        LoadingDialog dialog = new LoadingDialog(context);
        Message = message;
        dialog.setIndeterminate(true);
        dialog.setCancelable(false);
        return dialog;
    }

    private LoadingDialog(Context context) {
        super(context);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.progress_dialog);
        TextView mTextViewMessage = findViewById(R.id.tv_loading_message);
        mTextViewMessage.setText(Message);
    }

}