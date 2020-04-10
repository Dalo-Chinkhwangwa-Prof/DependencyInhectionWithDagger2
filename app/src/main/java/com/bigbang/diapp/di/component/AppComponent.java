package com.bigbang.diapp.di.component;

import com.bigbang.diapp.di.module.AppModule;
import com.bigbang.diapp.util.DebugLogger;
import com.bigbang.diapp.view.MainActivity;

import dagger.Component;

@Component(modules = {AppModule.class})
public interface AppComponent {
    void inject(DebugLogger debugLogger);
    void inject(MainActivity mainActivity);
}
