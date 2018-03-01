package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by liuning on 2018/2/28.
 */

public class Forecast {
    public String date;
    @SerializedName("tmp_max")
    public String temMax;
    @SerializedName("tmp_min")
    public String tmpMin;
    @SerializedName("cond_txt_d")
    public String info;


}
