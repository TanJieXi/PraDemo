package com.prademo;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by 谭杰栖 on 2018/1/4.
 */

public class ToastUtils {
    public static void showToast(Context context, String str) {
        Toast.makeText(context, str, Toast.LENGTH_LONG).show();
    }

    public static void showLong(Context context, String str) {
        Toast.makeText(context, str, Toast.LENGTH_LONG).show();
    }
}
