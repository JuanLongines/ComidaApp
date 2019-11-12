package com.longines.kekaschina.di;

import android.app.Application;

import com.longines.kekaschina.database.KekasDatabase;

public class Injector {
    private static KekasDatabase database;

    public static void setup(Application application) {
        database = KekasDatabase.getInstance(application);
    }

    public static KekasDatabase provideRoomDataBase() {
        return database;
    }

}
