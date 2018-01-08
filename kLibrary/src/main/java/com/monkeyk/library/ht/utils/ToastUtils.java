package com.monkeyk;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by lenovo on 2018/1/8.
 */

public class ToastUtils {
    public static void showToast(Context context, String str) {
        Toast.makeText(context, str, Toast.LENGTH_LONG).show();
    }
}
