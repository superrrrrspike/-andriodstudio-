package com.nice.NiceWeather.Javabeans;

import com.google.gson.annotations.SerializedName;

public class bodyBeans {
    @SerializedName("now")
    private nowBeans nowbeans;

    @SerializedName("time")
    private  String time; //20240521120000 更新时间

    @SerializedName("f1")
    private f1Beans f1beans;

    @Override
    public String toString() {
        return "bodyBeans{" +
                "nowbeans=" + nowbeans +
                ", time='" + time + '\'' +
                ", f1beans=" + f1beans +
                ", f2beans=" + f2beans +
                ", f3beans=" + f3beans +
                ", f4beans=" + f4beans +
                ", f5beans=" + f5beans +
                ", f6beans=" + f6beans +
                ", f7beans=" + f7beans +
                '}';
    }

    @SerializedName("f2")
    private f2Beans f2beans;
    @SerializedName("f3")
    private f3Beans f3beans;
    @SerializedName("f4")
    private f4Beans f4beans;
    @SerializedName("f5")
    private f5Beans f5beans;
    @SerializedName("f6")
    private f6Beans f6beans;
    @SerializedName("f7")
    private f7Beans f7beans;


    public nowBeans getNowbeans() {
        return nowbeans;
    }

    public void setNowbeans(nowBeans nowbeans) {
        this.nowbeans = nowbeans;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public f1Beans getF1beans() {
        return f1beans;
    }

    public void setF1beans(f1Beans f1beans) {
        this.f1beans = f1beans;
    }

    public f2Beans getF2beans() {
        return f2beans;
    }

    public void setF2beans(f2Beans f2beans) {
        this.f2beans = f2beans;
    }

    public f3Beans getF3beans() {
        return f3beans;
    }

    public void setF3beans(f3Beans f3beans) {
        this.f3beans = f3beans;
    }

    public f4Beans getF4beans() {
        return f4beans;
    }

    public void setF4beans(f4Beans f4beans) {
        this.f4beans = f4beans;
    }

    public f5Beans getF5beans() {
        return f5beans;
    }

    public void setF5beans(f5Beans f5beans) {
        this.f5beans = f5beans;
    }

    public f6Beans getF6beans() {
        return f6beans;
    }

    public void setF6beans(f6Beans f6beans) {
        this.f6beans = f6beans;
    }

    public f7Beans getF7beans() {
        return f7beans;
    }

    public void setF7beans(f7Beans f7beans) {
        this.f7beans = f7beans;
    }



}
