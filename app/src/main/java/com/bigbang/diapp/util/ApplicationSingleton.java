package com.bigbang.diapp.util;

import com.bigbang.diapp.di.component.AppComponent;

public class ApplicationSingleton {

    private AppComponent appComponent;

    public AppComponent getAppComponent() {
        return appComponent;
    }

    public void setAppComponent(AppComponent appComponent) {
        this.appComponent = appComponent;
    }

    private static ApplicationSingleton applicationSingleton = null;

    private ApplicationSingleton() {
    }

    public static ApplicationSingleton getInstance() {
        if (applicationSingleton == null)
            applicationSingleton = new ApplicationSingleton();
        return applicationSingleton;
    }


}
