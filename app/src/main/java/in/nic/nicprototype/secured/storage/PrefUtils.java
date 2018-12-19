/**
 * Flym
 * <p/>
 * Copyright (c) 2012-2015 Frederic Julian
 * <p/>
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p/>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p/>
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package in.nic.nicprototype.secured.storage;

import android.content.Context;
import android.content.SharedPreferences;


public class PrefUtils {


    public static final String USER_LOGGED_IN = "USER_LOGGED_IN";
    public static final String DEVICE_INITIALIZED = "DEVICE_INITIALIZED";
    public static final String JSON_USER_DASHBOARD = "JSON_USER_DASHBOARD";
    public static final String PREF = "PREF_FISH";
    public static final String NOTIFICATION_LATEST_MAX = "NOTIFICATION_LATEST_MAX";
    public static final String GET_SUMMARY = "GET_SUMMARY";
    public static final String POST_TRAVEL = "POST_TRAVEL";
    public static final String UPDATE_TRAVEL = "UPDATE_TRAVEL";
    public static final String CANCEL_TRAVEL = "CANCEL_TRAVEL";
    public static final String REPORT_RETURN = "REPORT_RETURN";
    public static final String GET_ALERTS = "GET_ALERTS";
    public static final String GET_TRAVELERS_LIST = "GET_TRAVELERS_LIST";
    public static final String USER_LOGOUT = "USER_LOGOUT";
    public static final String LANGUAGE_LOCALE = "LANGUAGE_LOCALE";
    public static final String LATITUDE = "LATITUDE";
    public static final String LONGITUDE = "LONGITUDE";
    public static final String FIREBASE_TOKEN = "FIREBASE_TOKEN";
    public static final String MOBILE_NUMBER = "MOBILE_NUMBER";
    public static final String PEN_NUMBER = "PEN_NUMBER";
    public static final String GET_JSONDATA = "GET_JSONDATA";
    public static final String EMPNAME = "EMPNAME";
    public static final String EMPID = "EMPID";
    public static final String CLICKLEAVE = "CLICKLEAVE";
    public static final String LEAVEID = "LEAVEID";
    public static final String EXTENDDATE = "EXTENDDATE";
    public static final String REPORTDATE = "EXTENDDATE";
    public static final String REPORTSTATUS = "EXTENDDATE";


    public static boolean getBoolean(String key, boolean defValue, Context context) {


        SharedPreferences settings = context.getSharedPreferences(PREF, Context.MODE_PRIVATE); // 0 - for private mode

        //SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(context);
        return settings.getBoolean(key, defValue);
    }

    public static void putBoolean(String key, boolean value, Context context) {

        SharedPreferences storage = context.getSharedPreferences(PREF, Context.MODE_PRIVATE); // 0 - for private mode

        SharedPreferences.Editor editor = storage.edit();
        editor.putBoolean(key, value);
        editor.apply();
        //editor.commit();
    }

    public static int getInt(String key, int defValue, Context context) {
        SharedPreferences settings = context.getSharedPreferences(PREF, Context.MODE_PRIVATE); // 0 - for private mode
        return settings.getInt(key, defValue);
    }

    public static void putInt(String key, int value, Context context) {
        SharedPreferences storage = context.getSharedPreferences(PREF, Context.MODE_PRIVATE); // 0 - for private mode

        SharedPreferences.Editor editor = storage.edit();

        editor.putInt(key, value);
        editor.apply();
        //editor.commit();
    }

    public static long getLong(String key, long defValue, Context context) {
        SharedPreferences settings = context.getSharedPreferences(PREF, Context.MODE_PRIVATE); // 0 - for private mode

        return settings.getLong(key, defValue);
    }

    public static void putLong(String key, long value, Context context) {

        SharedPreferences storage = context.getSharedPreferences(PREF, Context.MODE_PRIVATE); // 0 - for private mode

        SharedPreferences.Editor editor = storage.edit();
        editor.putLong(key, value);
        editor.apply();
        //editor.commit();
    }

    public static String getString(String key, String defValue, Context context) {
        SharedPreferences settings = context.getSharedPreferences(PREF, Context.MODE_PRIVATE); // 0 - for private mode

        return settings.getString(key, defValue);
    }

    public static void putString(String key, String value, Context context) {
        SharedPreferences storage = context.getSharedPreferences(PREF, Context.MODE_PRIVATE); // 0 - for private mode

        SharedPreferences.Editor editor = storage.edit();
        editor.putString(key, value);
        editor.apply();
        //editor.commit();
    }

    public static void remove(String key, Context context) {
        SharedPreferences storage = context.getSharedPreferences(PREF, Context.MODE_PRIVATE); // 0 - for private mode

        SharedPreferences.Editor editor = storage.edit();

        editor.remove(key);
        editor.apply();
        // editor.commit();
    }

    public static void putdashboardDataString(String key, String value, Context context) {

        SharedPreferences storage = context.getSharedPreferences(PREF, Context.MODE_PRIVATE); // 0 - for private mode

        SharedPreferences.Editor editor = storage.edit();
        editor.putString(key, value);
        editor.apply();

    }


    public static void resetAllAndLogout(Context cn) {


       /* SharedPreferences settings = cn.getSharedPreferences(PREF, Context.MODE_PRIVATE); // 0 - for private mode

        settings.edit().clear().commit();


        Intent Intent_home = new Intent(cn, splashscreen.class);
        PrefUtils.putBoolean(PrefUtils.USER_LOGGED_IN,false,cn);

        Intent_home.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

        Intent_home.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);

        cn.startActivity(Intent_home);
        {
            ((Activity)cn).finishAffinity();
            ((Activity)cn).finish();
        }
        try
        {
            Runtime.getRuntime().exit(0);
        }
        catch (Exception D)
        {

        }*/

    }

    public static void resetAll(Context cn) {


        SharedPreferences settings = cn.getSharedPreferences(PREF, Context.MODE_PRIVATE); // 0 - for private mode

        settings.edit().clear().commit();


    }
}
