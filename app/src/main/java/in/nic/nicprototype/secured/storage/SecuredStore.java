package in.nic.nicprototype.secured.storage;

import android.content.Context;

import in.nic.nicprototype.natives.LinkCppToJava;
import in.nic.nicprototype.secured.crypto.AESEnDecryption;


public class SecuredStore {
    Context context;

    public static final String DEVICE_IV = "DEVICE_IV";
    public static final String DEVICE_KEY = "DEVICE_KEY";
    public static final String DEVICE_HASH = "DEVICE_HASH";

    public static final String USER_IV = "USER_IV";
    public static final String USER_KEY = "USER_KEY";
    public static final String OTPREQUEST_URL = "OTPREQUEST_URL";
    public static final String OTPVERIFY_URL = "OTPVERIFY_URL";
    public static final String USER_HASH = "USER_HASH";

    public static final String USER_MOB = "USER_MOB";
    public static final String DEVICE_ID = "DEVICE_ID";
    public static final String USER_DASHBOARD = "DEVICE_ID";
    public static final String TEST = "TEST";



    public static boolean SecuredStore(Context context, String key, String value)
    {
        String saveThis="0";
        try
        {
            saveThis= AESEnDecryption.encryptStrAndToBase64(LinkCppToJava.stringFromJNI('R'),
                    LinkCppToJava.stringFromJNI('Y'),value);
        }
        catch (Exception ignored)
        {

        }
         PrefUtils.putString(key,saveThis, context);
         return true;

    }

    public static String SecuredRetrieve(Context context, String key)
    {

        String data= PrefUtils.getString(key,"",context);
        String actual="1";
        try
        {

        actual= AESEnDecryption.decryptStrAndFromBase64(LinkCppToJava.stringFromJNI('R'),
                LinkCppToJava.stringFromJNI('Y'),data);

        }
        catch (Exception d)
        {
            PrefUtils.resetAllAndLogout(context);
        }
            return actual;
    }
    public  static void ResetAndLogoutWithMessege()
    {
    }

}
