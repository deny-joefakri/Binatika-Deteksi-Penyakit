package com.binatika.deteksigolongandarah.util;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by asus on 02/08/2016.
 */
public class UserPreference {
    public static final String INPUT = "isInput";

    private SharedPreferences prefs;
    Context context;
    private static UserPreference helper;
    private SharedPreferences.Editor editor;

    public static UserPreference getInstance(Context context) {
        if (helper == null) {
            helper = new UserPreference(context);
        }
        return helper;
    }

    private UserPreference(Context context) {
        this.context = context;
        prefs = context.getSharedPreferences("Binatika", Context.MODE_PRIVATE);
        editor = prefs.edit();
    }

    public void setInput(boolean data) {
        editor.putBoolean(INPUT, data);
        editor.commit();
    }

    public boolean getInput() {
        return prefs.getBoolean(INPUT, false);
    }


}
