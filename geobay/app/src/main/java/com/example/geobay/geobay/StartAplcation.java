package com.example.geobay.geobay;


import android.app.Application;

import com.parse.Parse;

public class StartAplcation extends Application {
    @Override
    public void onCreate() {
        super.onCreate();


        Parse.enableLocalDatastore(this);

        Parse.initialize(this,"ComHr0Vmlu7t3kcYZujKgiOTRy3bPUNchxaudutm", "MHRt9srcHEiYqX9RJtNzbojXE6eKo7gLZZcMUFOS" );
    }
}
