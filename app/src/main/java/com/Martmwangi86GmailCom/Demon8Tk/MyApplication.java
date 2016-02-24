package com.Martmwangi86GmailCom.Demon8Tk;

import android.app.Application;

import com.estimote.sdk.EstimoteSDK;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        EstimoteSDK.initialize(getApplicationContext(), "demon-8tk", "f3ed6216ebdf3fd26b6349c0cbc01391");

        // uncomment to enable debug-level logging
        // it's usually only a good idea when troubleshooting issues with the Estimote SDK
//        EstimoteSDK.enableDebugLogging(true);
    }
}
