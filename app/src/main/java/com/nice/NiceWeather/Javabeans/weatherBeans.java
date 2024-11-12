package com.nice.NiceWeather.Javabeans;

import com.google.gson.annotations.SerializedName;

public class weatherBeans {
    @SerializedName("showapi_res_body")
    private bodyBeans bodybean;


    public bodyBeans getBodybean() {
        return bodybean;
    }

    public void setBodybean(bodyBeans bodybean) {
        this.bodybean = bodybean;
    }

    @Override
    public String toString() {
        return "weatherBeans{" +
                "bodybean=" + bodybean +
                '}';
    }
}
