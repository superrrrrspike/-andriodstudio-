package com.nice.NiceWeather.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
public class Httputil {
    private  static  final  String urlbase="https://route.showapi.com/9-2?showapi_appid=1603252&showapi_sign=927c787a45aa453997855a60b9cac8c5&needMoreDay=1&needHourData=1&need3HourForcast=1&areaCode=";
    public static String doGet(String urlstr){
        //该方法负责访问HTTP页面，从API中取到JSON消息。
        String result="";
        HttpURLConnection connection=null;
        InputStreamReader inputStreamReader=null;
        BufferedReader bufferedReader=null;
        try {
            URL url=new URL(urlstr);
            connection=(HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            InputStream inputStream=connection.getInputStream();
            inputStreamReader=new InputStreamReader(inputStream);
            bufferedReader =new BufferedReader(inputStreamReader);
            StringBuilder stringBuilder=new StringBuilder();
            String line="";
            while ((line=bufferedReader.readLine())!=null){
                stringBuilder.append(line);
            }
            result=stringBuilder.toString();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (connection!=null){
                connection.disconnect();
            }
            if (inputStreamReader!=null){
                try {
                    inputStreamReader.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            if (bufferedReader !=null){
                try{
                    bufferedReader.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }

        }
        return result;

    }
    public static String getcityWeather(String city)  {
        String result="";
        String adcode="";
        switch (city){
            case"北京":
                adcode="110000";
                break;
            case"沈阳":
                adcode="210100";
                break;
            case"武汉":
                adcode="420100";
                break;
            case"广州":
                adcode="440100";
                break;
            case "成都":
                adcode="510100";
                break;
        }
        String weatherUrl=urlbase+adcode;
        return doGet(weatherUrl);
    }
}
