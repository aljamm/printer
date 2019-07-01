package com.aljammal.printer.Utils;

import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;

import java.util.Objects;


public class ProgressDialogUtil {

    private static ProgressDialog mProgressDialog = null;

    public static void showLoadingDialog(String message, Context context) {
        mProgressDialog = LoadingDialog.inIt(context, message);
        Objects.requireNonNull(mProgressDialog.getWindow()).setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        mProgressDialog.show();
    }

    public static void hideLoadingDialog() {
        if (mProgressDialog != null)
            mProgressDialog.dismiss();
    }
}
