package com.mystudy.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zhu on 2017/7/16.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
