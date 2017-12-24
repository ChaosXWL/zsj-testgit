package com.mystudy.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zhu on 2017/7/16.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }

}
