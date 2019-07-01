package com.aljammal.printer.Utils;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;

import androidx.appcompat.app.AlertDialog;

import com.aljammal.printer.R;


public class ValidationUtility {
    public static void showErrorDialog(String ErrorTitle, String errorMessage, Context context) {
        AlertDialog.Builder builder;
        builder = new AlertDialog.Builder(context, android.R.style.Theme_Material_Light_Dialog_NoActionBar);
        builder.setTitle(ErrorTitle)
                .setMessage(errorMessage)
                .setNegativeButton(android.R.string.no, (dialog, which) -> {
                    // do nothing
                })
                .setIcon(android.R.drawable.ic_dialog_info)
                .show();
    }
    public static void showErrorDialogForTime(String ErrorTitle, String errorMessage, Context context) {
        AlertDialog.Builder builder;
        builder = new AlertDialog.Builder(context, android.R.style.Theme_Material_Light_Dialog_NoActionBar);
        builder.setTitle(ErrorTitle)
                .setMessage(errorMessage)
                .setIcon(android.R.drawable.ic_dialog_info);

        final AlertDialog alert = builder.create();

        alert.show();
        final Handler handler = new Handler();
        handler.postDelayed(() -> alert.dismiss(), 2000);
    }


    public static void showMessage(String message ,Context context) {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(context);

        builder.setMessage(message);
        builder.setPositiveButton(context.getResources().getString(R.string.ok), (dialog, which) -> dialog.dismiss());

        android.app.AlertDialog alert = builder.create();
        alert.show();
    }
    public static void showMessageEndActivity(String message , final Context context) {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(context);

        builder.setMessage(message);
        builder.setPositiveButton(context.getResources().getString(R.string.ok), (dialog, which) -> {
            dialog.dismiss();
            ((Activity) context).finish();
        });

        android.app.AlertDialog alert = builder.create();
        alert.show();
    }



}
