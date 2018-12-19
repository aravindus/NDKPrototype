package in.nic.nicprototype.utils;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class NICUtils {

    /*public void InitAPI() {
        showpDialog();
        NetworkUtility conn = new NetworkUtility();
        // getDeviceID();
        if (conn.checkConnection(Context)) {


        } else {

            NotifyUserWithDialogueRetry(Context.getString(R.string.nonet), INIT);
            return;
        }
        try {
            URL = link.linkTo('I');

        } catch (Exception f) {

        }


        RequestQueue queue = Volley.newRequestQueue(Context);
        queue.getCache().clear();
        StringRequest sr = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {

            @Override
            public void onResponse(String response) {
                try {

                    JSONObject jobject = new JSONObject(response.toString().trim());
                    Log.e("SYAM", String.valueOf(jobject));

                    JSONObject objStatus = jobject.getJSONObject(Constants.json_response).getJSONObject(Constants.json_operation);

                    try {
                        JSONObject objVersion = jobject.getJSONObject(Constants.json_response).getJSONObject(Constants.platform);
                        if (!ValidateVersion(objVersion)) return;
                    } catch (Exception e) {
                        hidepDialog();
                    }


                    if (!ValidateResponse(objStatus, INIT)) {
                        return;
                    }

                    PrefUtils.putBoolean(DEVICE_INITIALIZED, true, Context);


                    JSONObject objdata = jobject.getJSONObject(Constants.json_response).getJSONObject(Constants.json_data);
                    strInitKey = objdata.get("initKey").toString();
                    strInitIV = objdata.get("initIv").toString();
                    strOtpURL = objdata.get("url").toString();
                    strInitHash = objdata.get("initHash").toString();


                    SecuredStore.SecuredStore(Context, SecuredStore.DEVICE_IV, strInitIV);
                    SecuredStore.SecuredStore(Context, SecuredStore.DEVICE_KEY, strInitKey);
                    SecuredStore.SecuredStore(Context, SecuredStore.OTPREQUEST_URL, strOtpURL);
                    SecuredStore.SecuredStore(Context, SecuredStore.DEVICE_HASH, strInitHash);
                    Intent otp_Intent = new Intent(Context, loginScreen.class);
                    otp_Intent.putExtra("url", strVerifyOtpURL);
                    otp_Intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    Context.startActivity(otp_Intent);
                    {
                        ((Activity) Context).finish();
                    }

                } catch (JSONException e) {


                    MESSAGE = Context.getString(R.string.noservice);
                    NotifyUserWithLogoutAndRetryOptions2(MESSAGE, INIT);

                    hidepDialog();
                }
                if ((strInitKey.trim().equals("")) && (!strInitIV.trim().equals(""))) {
                    Toast.makeText(Context, "Device Initialisation Failed !!!", Toast.LENGTH_SHORT).show();
                    hidepDialog();
                } else {


                }

                hidepDialog();

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                Log.e("SYAM", String.valueOf(error));
                MESSAGE = Context.getString(R.string.noservice);
                NotifyUserWithLogoutAndRetryOptions2(MESSAGE, INIT);


                hidepDialog();

            }

        }) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> params = new HashMap<String, String>();

                // String language = PrefUtils.getString(PrefUtils.LANGUAGE_LOCALE,"Nodata",Context);

                JSONObject jsonBody = new JSONObject();

                try {

                    jsonBody.put("deviceid", EncryptUsingInitUserKeys(getDeviceID()));
                    jsonBody.put("ostype", "Android");
                    jsonBody.put("version", "1");

                } catch (JSONException e) {

                }

                params.put("DeviceInit", jsonBody.toString());

                return params;
            }

//            @Override
//            public Map<String, String> getHeaders() throws AuthFailureError {
//                Map<String,String> params = new HashMap<String, String>();
//                params.put("Content-Type","application/x-www-form-urlencoded");
//                return params;
//            }
        };

        sr.setRetryPolicy(new DefaultRetryPolicy(
                MY_SOCKET_TIMEOUT_MS,
                DefaultRetryPolicy.DEFAULT_MAX_RETRIES,
                DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));

        queue.add(sr);
    }*/

}
