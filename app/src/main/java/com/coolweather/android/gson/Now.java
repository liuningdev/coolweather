package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by liuning on 2018/2/28.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond_txt")
    public String info;

}
