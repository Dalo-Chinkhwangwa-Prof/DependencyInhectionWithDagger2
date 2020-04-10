package com.bigbang.diapp.view;

import android.content.Context;
import android.widget.TimePicker;
import android.widget.Toast;

public class Toaster {

    private Context context;

    public Toaster(Context context) {
        this.context = context;
    }

    public void toastBread(String butter) {
        Toast.makeText(context, butter, Toast.LENGTH_LONG).show();
    }
}
