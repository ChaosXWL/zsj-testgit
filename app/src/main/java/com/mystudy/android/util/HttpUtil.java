package com.mystudy.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by zhu on 2017/7/6.
 */

public class HttpUtil {
    public static void sendRequest(String address,okhttp3.Callback callback){
        
        //test
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
