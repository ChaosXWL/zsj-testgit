package com.mystudy.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zhu on 2017/7/16.
 */

public class AQI {
    @SerializedName("city")
    public AQICity aqiCity;

    public class AQICity{
        public String aqi;
        public  String pm25;
    }
}
