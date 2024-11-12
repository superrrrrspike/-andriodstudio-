package com.nice.NiceWeather.Javabeans;

import com.google.gson.annotations.SerializedName;

public class nowBeans {
    @SerializedName("weather")
    private  String weather;

    @SerializedName("temperature")
    private String temp;

    @SerializedName("weather_pic")
    private String weather_url;

    @SerializedName("wind_direction")
    private String wind_direction;

    @SerializedName("wind_power")
    private String wind_power;

    @SerializedName("aqi")
    private String aqi;

    @Override
    public String toString() {
        return "nowBeans{" +
                "weather='" + weather + '\'' +
                ", temp='" + temp + '\'' +
                ", weather_url='" + weather_url + '\'' +
                ", wind_direction='" + wind_direction + '\'' +
                ", wind_power='" + wind_power + '\'' +
                ", aqi='" + aqi + '\'' +
                '}';
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getWeather_url() {
        return weather_url;
    }

    public void setWeather_url(String weather_url) {
        this.weather_url = weather_url;
    }

    public String getWind_direction() {
        return wind_direction;
    }

    public void setWind_direction(String wind_direction) {
        this.wind_direction = wind_direction;
    }

    public String getWind_power() {
        return wind_power;
    }

    public void setWind_power(String wind_power) {
        this.wind_power = wind_power;
    }

    public String getAqi() {
        return aqi;
    }

    public void setAqi(String aqi) {
        this.aqi = aqi;
    }
}
