package com.nice.NiceWeather.Javabeans;

import com.google.gson.annotations.SerializedName;

public class hourbeans {
    @SerializedName("temperature")
    private String temp;
    @SerializedName("weather")
    private String weather;
    @SerializedName("hour")
    private String hour;

    @Override
    public String toString() {
        return "hourbeans{" +
                "temp='" + temp + '\'' +
                ", weather='" + weather + '\'' +
                ", hour='" + hour + '\'' +
                '}';
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }
}
