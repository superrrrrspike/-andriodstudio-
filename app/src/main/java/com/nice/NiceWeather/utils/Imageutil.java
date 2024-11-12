package com.nice.NiceWeather.utils;

import com.nice.NiceWeather.R;

public class Imageutil {
    public static  int getImageResouce(String weatherkind) {
        switch (weatherkind){
            case"晴":
                return R.drawable.sun;
            case"阴":
                return R.drawable.yin;
            case "多云":
                return R.drawable.cloudy;
            case "小雨":
                return R.drawable.rain;
            case "中雨":
                return R.drawable.rain;
            case "大雨":
                return R.drawable.rain;
            case "雷阵雨":
                return R.drawable.thunders;
            case"阵雨":
                return R.drawable.rain;
            case "霾":
                return R.drawable.mai;
            case "雾":
                return R.drawable.smoke;
            default:
                return R.drawable.sun;

        }
    }
}
