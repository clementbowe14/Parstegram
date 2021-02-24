package com.example.parstagram;
import android.app.Application;
import android.os.Bundle;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    public void onCreate() {
        super.onCreate();

        //Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("fyelOwzXDnr0p4WBPRUHKMx2LXH8Sh6foBucfIab")
                .clientKey("xqx7q2tSGSbGrAERVOoOGLePKdrvggACJG5LISmL")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}