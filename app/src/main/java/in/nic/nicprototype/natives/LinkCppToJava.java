package in.nic.nicprototype.natives;

public class LinkCppToJava {

    static {
        // Replace "Myfile" with the name of your Native File
        System.loadLibrary("native-lib");
    }

    // Declare your native methods here

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public static native String stringFromJNI(char input);
}
