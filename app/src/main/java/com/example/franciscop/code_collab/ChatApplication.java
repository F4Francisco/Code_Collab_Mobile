package com.example.franciscop.code_collab;

import android.app.Application;

/**
 * Created by FranciscoP on 12/22/16.
 */

public class ChatApplication extends Application{
    public static final String APP_KEY_ID = "";
    public static final String APP_CLIENT_ID = "";

    @Override
    public void onCreate(){
        super.onCreate();
        //Parse.enableLocalDatastore(this);
        //Parse.initalize(this, APP_KEY_ID,APP_CLIENT_ID);
    }
}
