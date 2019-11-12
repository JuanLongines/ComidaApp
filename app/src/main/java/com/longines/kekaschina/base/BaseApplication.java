package com.longines.kekaschina.base;

import android.app.Application;

import com.longines.kekaschina.di.Injector;

public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Injector.setup(this);
    }
}
