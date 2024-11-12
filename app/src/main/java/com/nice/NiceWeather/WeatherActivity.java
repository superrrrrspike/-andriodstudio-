package com.nice.NiceWeather;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;
import com.nice.NiceWeather.adapter.FutureWeatherAdapter;
import com.nice.NiceWeather.Javabeans.weatherBeans;
import com.nice.NiceWeather.adapter.HourWeatherAdapter;
import com.nice.NiceWeather.utils.Imageutil;
import com.nice.NiceWeather.utils.Httputil;

public class WeatherActivity extends AppCompatActivity {
    private AppCompatSpinner spinner;
    private ArrayAdapter<String> spAdapter;
    private String[] cities;
    private TextView tv_temp,tv_windpower,tv_winddirect,tv_air;
    private ImageView img_weather;
    private FutureWeatherAdapter futureWeatherAdapter;
    private  HourWeatherAdapter hourweatheradapter;
    private RecyclerView rlv_future;
    private Button btn_mp3;
    private RecyclerView rlv_hour;

    private Handler handler=new Handler(Looper.myLooper()){
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            if (msg.what==0){
                String weather=(String) msg.obj;
                Gson gson=new Gson();
                weatherBeans weatherBeans=gson.fromJson(weather,com.nice.NiceWeather.Javabeans.weatherBeans.class);
                tv_air.setText("空气指数："+weatherBeans.getBodybean().getNowbeans().getAqi());
                tv_temp.setText(weatherBeans.getBodybean().getNowbeans().getTemp()+"℃");
                tv_winddirect.setText(weatherBeans.getBodybean().getNowbeans().getWind_direction());
                tv_windpower.setText(weatherBeans.getBodybean().getNowbeans().getWind_power());
                img_weather.setImageResource(Imageutil.getImageResouce(weatherBeans.getBodybean().getNowbeans().getWeather()));

                futureWeatherAdapter=new FutureWeatherAdapter(WeatherActivity.this,weatherBeans.getBodybean());
                rlv_future.setAdapter(futureWeatherAdapter);
                LinearLayoutManager linearLayoutManager=new LinearLayoutManager(WeatherActivity.this, LinearLayoutManager.HORIZONTAL,false);
                rlv_future.setLayoutManager(linearLayoutManager);

                hourweatheradapter=new HourWeatherAdapter(WeatherActivity.this,weatherBeans.getBodybean());
                rlv_hour.setAdapter(hourweatheradapter);
                LinearLayoutManager linearLayoutManager2=new LinearLayoutManager(WeatherActivity.this, LinearLayoutManager.HORIZONTAL,false);
                rlv_hour.setLayoutManager(linearLayoutManager2);


            }
        }
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    //组件注册方法
    private void initView() {
        spinner=findViewById(R.id.sp_city);
        cities=getResources().getStringArray(R.array.cities);
        spAdapter=new ArrayAdapter<String>(this,R.layout.spinner_layout,cities);
        spinner.setAdapter(spAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                String selected_city=cities[position];
                getWeatherofcity(selected_city);

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        tv_air=findViewById(R.id.tv_air);
        tv_temp=findViewById(R.id.tv_tem);
        tv_winddirect=findViewById(R.id.tv_winddirect);
        tv_windpower=findViewById(R.id.tv_windpower);
        rlv_future=findViewById(R.id.rlv_future);
        img_weather=findViewById(R.id.img_weather);
        rlv_hour = findViewById(R.id.rlv_hour);




    }

    private void getWeatherofcity(String selectedCity) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                String weatherstr= Httputil.getcityWeather(selectedCity);
                Message message=Message.obtain();
                message.what=0;
                message.obj=weatherstr;
                handler.sendMessage(message);
            }
        }).start();
    }


}