package com.example.xyzreader.utils;

import android.content.Context;

import com.example.xyzreader.R;

/**
 * Created by manuel on 29/5/16.
 */
public class Utils {

    public static boolean isTablet(Context context){
        return context.getResources().getBoolean(R.bool.isTablet);
    }

    public static boolean isLand(Context context){
        return context.getResources().getBoolean(R.bool.isLand);
    }
}
