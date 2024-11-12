package com.nice.NiceWeather.Javabeans;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class f1Beans  {
    @SerializedName("weekday")
    private String weekday; //3 代表周三
    @SerializedName("day_weather")
    private String day_weather;
    @SerializedName("day_weather_pic")
    private String weather_url;
    @SerializedName("day_air_temperature")
    private String day_temp;
    @SerializedName("night_air_temperature")
    private String night_temp;

    @SerializedName("3hourForcast")
    private List<hourbeans> hourForcast;

    @Override
    public String toString() {
        return "f1Beans{" +
                "weekday='" + weekday + '\'' +
                ", day_weather='" + day_weather + '\'' +
                ", weather_url='" + weather_url + '\'' +
                ", day_temp='" + day_temp + '\'' +
                ", night_temp='" + night_temp + '\'' +
                ", hourForcast=" + hourForcast +
                '}';
    }

    public String getWeekday() {
        return weekday;
    }

    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }

    public String getDay_weather() {
        return day_weather;
    }

    public void setDay_weather(String day_weather) {
        this.day_weather = day_weather;
    }

    public String getWeather_url() {
        return weather_url;
    }

    public void setWeather_url(String weather_url) {
        this.weather_url = weather_url;
    }

    public String getDay_temp() {
        return day_temp;
    }

    public void setDay_temp(String day_temp) {
        this.day_temp = day_temp;
    }

    public String getNight_temp() {
        return night_temp;
    }

    public void setNight_temp(String night_temp) {
        this.night_temp = night_temp;
    }

    public List<hourbeans> getHourForcast() {
        return hourForcast;
    }

    public void setHourForcast(List<hourbeans> hourForcast) {
        this.hourForcast = hourForcast;
    }
}
