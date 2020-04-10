package com.bigbang.diapp.util;

import android.util.Log;

import com.bigbang.diapp.view.Toaster;

import javax.inject.Inject;

public class DebugLogger {

    @Inject
    Toaster messageToaster;

    public DebugLogger() {
        ApplicationSingleton.getInstance().getAppComponent().inject(this);
    }

    public void logDebug(String message){
        Log.d("TAG_X", message);
        messageToaster.toastBread(message);
    }
}
