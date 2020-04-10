package com.bigbang.diapp.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.bigbang.diapp.R;
import com.bigbang.diapp.util.ApplicationSingleton;
import com.bigbang.diapp.util.DebugLogger;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    DebugLogger debugLogger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ApplicationSingleton.getInstance().getAppComponent().inject(this);

        debugLogger.logDebug("Application Created :D");
    }
}
