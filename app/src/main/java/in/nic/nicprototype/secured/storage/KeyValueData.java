package in.nic.nicprototype.secured.storage;

/**
 * Created by HARI on 21-11-2017.
 */


public class KeyValueData {

    String strKey;
    String strValue;


    public KeyValueData(String key, String value ) {
        this.strKey=key;
        this.strValue=value;
    }

    public String getKey() {
        return strKey;
    }

    public String getValue() {
        return strValue;
    }

}
