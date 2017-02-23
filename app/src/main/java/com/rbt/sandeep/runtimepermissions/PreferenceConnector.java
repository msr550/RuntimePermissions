package com.rbt.sandeep.runtimepermissions;

import android.content.Context;
import android.content.SharedPreferences;


/**
 * Created by Sandeep Maram on 23/2/17.
 */
public final class PreferenceConnector {
    public static final String PREF_NAME = "Runtime Permissions";     // preference name
    public static final int MODE = Context.MODE_PRIVATE;    // mode

    /**
     * Used to write a boolean value in the preferences
     *
     * @param context Activity context
     * @param key     The name of the preference to modify.
     * @param value   The new value for the preference.
     */
    public static void writeBoolean(Context context, String key, boolean value) {
        getEditor(context).putBoolean(key, value).commit();
    }

    /**
     * Used to write a boolean value in the preferences
     *
     * @param context  Activity context
     * @param key      The name of the preference to modify.
     * @param defValue Value to return if this preference does not exist.
     * @return Returns the preference value if it exists, or defValue.
     * Throws ClassCastException if there is a preference with this name that is not a boolean.
     */
    public static boolean readBoolean(Context context, String key, boolean defValue) {
        return getPreferences(context).getBoolean(key, defValue);
    }

    /**
     * Used to write a boolean value in the preferences
     *
     * @param context Activity context
     * @param key     The name of the preference to modify.
     * @param value   The new value for the preference.
     */
    public static void writeInteger(Context context, String key, int value) {
        getEditor(context).putInt(key, value).commit();
    }

    /**
     * Used to write a boolean value in the preferences
     *
     * @param context  Activity context
     * @param key      The name of the preference to modify.
     * @param defValue Value to return if this preference does not exist.
     * @return Returns the preference value if it exists, or defValue.
     * Throws ClassCastException if there is a preference with this name that is not an int.
     */
    public static int readInteger(Context context, String key, int defValue) {
        return getPreferences(context).getInt(key, defValue);
    }

    /**
     * Used to write a String value in the preferences
     *
     * @param context Activity context
     * @param key     The name of the preference to modify.
     * @param value   The new value for the preference.
     */
    public static void writeString(Context context, String key, String value) {
        getEditor(context).putString(key, value).commit();

    }

    /**
     * Used to write a boolean value in the preferences
     *
     * @param context  Activity context
     * @param key      The name of the preference to modify.
     * @param defValue Value to return if this preference does not exist.
     * @returnReturns the preference value if it exists, or defValue.
     * Throws ClassCastException if there is a preference with this name that is not a String.
     */
    public static String readString(Context context, String key, String defValue) {
        return getPreferences(context).getString(key, defValue);
    }

    /**
     * Used to write a float value in the preferences
     *
     * @param context Activity context
     * @param key     The name of the preference to modify.
     * @param value   The new value for the preference.
     */
    public static void writeFloat(Context context, String key, float value) {
        getEditor(context).putFloat(key, value).commit();
    }

    /**
     * Used to write a boolean value in the preferences
     *
     * @param context  Activity context
     * @param key      The name of the preference to modify.
     * @param defValue Value to return if this preference does not exist.
     * @return Returns the preference value if it exists, or defValue.
     * Throws ClassCastException if there is a preference with this name that is not a float.
     */
    public static float readFloat(Context context, String key, float defValue) {
        return getPreferences(context).getFloat(key, defValue);
    }

    /**
     * Used to write a Long value in the preferences
     *
     * @param context Activity context
     * @param key     The name of the preference to modify.
     * @param value   The new value for the preference.
     */
    public static void writeLong(Context context, String key, long value) {
        getEditor(context).putLong(key, value).commit();
    }

    /**
     * Used to write a boolean value in the preferences
     *
     * @param context  Activity context
     * @param key      The name of the preference to modify.
     * @param defValue Value to return if this preference does not exist.
     * @return Returns the preference value if it exists, or defValue.
     * Throws ClassCastException if there is a preference with this name that is not a long.
     */
    public static long readLong(Context context, String key, long defValue) {
        return getPreferences(context).getLong(key, defValue);
    }

    /**
     * Used to get the shared preferences object
     *
     * @param context Activity context
     * @return The single SharedPreferences instance that can be used to retrieve and modify the preference values.
     */
    public static SharedPreferences getPreferences(Context context) {
        return context.getSharedPreferences(PREF_NAME, MODE);
    }

    /**
     * Used to get the SharedPreferences.Editor obejct
     *
     * @param context Activity context
     * @return The single SharedPreferences instance that can be used to retrieve and modify the preference values.
     */
    public static SharedPreferences.Editor getEditor(Context context) {
        return getPreferences(context).edit();
    }

    /**
     * Used to remove the value from the shared preference
     *
     * @param context Activity context
     */
    public static void clear(Context context) {
        getEditor(context).clear().commit();
    }

    /**
     * @param context context / activity
     * @param key     key
     */
    public static void removeKey(Context context, String key) {
        getEditor(context).remove(key).commit();
    }
}
