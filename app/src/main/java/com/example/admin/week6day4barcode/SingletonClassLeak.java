package com.example.admin.week6day4barcode;

import android.content.Context;

/**
 * Created by  Admin on 12/14/2017.
 */

public class SingletonClassLeak {

    private Context context;
    private static SingletonClassLeak instance;

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public static SingletonClassLeak getInstance() {
        if (instance == null) {
            instance = new SingletonClassLeak();
        }
        return instance;
    }
}
