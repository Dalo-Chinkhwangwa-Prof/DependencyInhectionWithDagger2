package com.bigbang.diapp.di.module;


import android.content.Context;

import com.bigbang.diapp.util.DebugLogger;
import com.bigbang.diapp.view.Toaster;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    private Context context;

    public AppModule(Context context) {
        this.context = context;
    }

    @Provides
    public Toaster providesToaster(){
        return new Toaster(context);
    }

    @Provides
    DebugLogger providesDebugLogger(){
        return new DebugLogger();
    }
}
