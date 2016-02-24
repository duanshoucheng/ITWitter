package com.itwitter;

import android.app.Application;
import android.graphics.Typeface;

import com.beardedhen.androidbootstrap.TypefaceProvider;

/**
 * Created by 段守成 on 15/12/29.
 * 邮箱:dsc428@126.com
 */
public class ITwitterApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        TypefaceProvider.registerDefaultIconSets();
    }
}
