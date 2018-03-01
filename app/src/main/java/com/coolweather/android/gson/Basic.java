package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by liuning on 2018/2/28.
 */

public class Basic {
    @SerializedName("location")
    public String cityName;

    @SerializedName("cid")
    public String weatherId;

}
