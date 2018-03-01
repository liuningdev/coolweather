package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by liuning on 2018/2/28.
 */

public class Weather {
    public String status;
    public Basic basic;
    public Update update;
//    public AQI aqi;
    public Now now;
    public List<Lifestyle> lifestyle;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;


}
