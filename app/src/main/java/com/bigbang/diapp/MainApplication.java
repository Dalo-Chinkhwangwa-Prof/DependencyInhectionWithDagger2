package com.bigbang.diapp;

import android.app.Application;
import android.util.Log;

import com.bigbang.diapp.di.component.AppComponent;
import com.bigbang.diapp.di.component.DaggerAppComponent;
import com.bigbang.diapp.di.module.AppModule;
import com.bigbang.diapp.util.ApplicationSingleton;

public class MainApplication extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        Log.d("TAG_X", "Applicaiton created.............");

        appComponent = DaggerAppComponent
                .builder()
                .appModule(new AppModule(this))
                .build();
        
        ApplicationSingleton.getInstance().setAppComponent(appComponent);
    }

}
