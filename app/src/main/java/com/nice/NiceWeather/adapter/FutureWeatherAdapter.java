package com.nice.NiceWeather.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nice.NiceWeather.R;
import com.nice.NiceWeather.Javabeans.bodyBeans;
import com.nice.NiceWeather.utils.Imageutil;

public class FutureWeatherAdapter extends RecyclerView.Adapter<FutureWeatherAdapter.Weatherviewholder> {
    private Context context;
    private bodyBeans bodybeans;

    public FutureWeatherAdapter(Context inicontext,bodyBeans inibodybeans) {
        context=inicontext;
        bodybeans=inibodybeans;


    }

    @NonNull
    @Override
    public Weatherviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(context).inflate(R.layout.recycle_future_layout,parent,false);
        Weatherviewholder wh =new Weatherviewholder(view);
        return wh;
    }

    @Override
    public void onBindViewHolder(@NonNull Weatherviewholder holder, int position) {
        String week="";
      switch (position){
          case 0:
              holder.img_fweather.setImageResource(Imageutil.getImageResouce(bodybeans.getF1beans().getDay_weather()));
              holder.tv_daytemp.setText(bodybeans.getF1beans().getDay_temp()+"℃");
              holder.tv_nighttemp.setText(bodybeans.getF1beans().getNight_temp()+"℃");
              holder.tv_week.setText("今日");
              break;
          case 1:
              holder.img_fweather.setImageResource(Imageutil.getImageResouce(bodybeans.getF2beans().getDay_weather()));
              holder.tv_daytemp.setText(bodybeans.getF2beans().getDay_temp()+"℃");
              holder.tv_nighttemp.setText(bodybeans.getF2beans().getNight_temp()+"℃");
               week=bodybeans.getF2beans().getWeekday();
              if (week.equals("7")){
                  week="日";
              }
              holder.tv_week.setText("星期"+week);
              break;
          case 2:
              holder.img_fweather.setImageResource(Imageutil.getImageResouce(bodybeans.getF3beans().getDay_weather()));
              holder.tv_daytemp.setText(bodybeans.getF3beans().getDay_temp()+"℃");
              holder.tv_nighttemp.setText(bodybeans.getF3beans().getNight_temp()+"℃");
               week=bodybeans.getF3beans().getWeekday();
              if (week.equals("7")){
                  week="日";
              }
              holder.tv_week.setText("星期"+week);
              break;
          case 3:
              holder.img_fweather.setImageResource(Imageutil.getImageResouce(bodybeans.getF4beans().getDay_weather()));
              holder.tv_daytemp.setText(bodybeans.getF4beans().getDay_temp()+"℃");
              holder.tv_nighttemp.setText(bodybeans.getF4beans().getNight_temp()+"℃");
               week=bodybeans.getF4beans().getWeekday();
              if (week.equals("7")){
                  week="日";
              }
              holder.tv_week.setText("星期"+week);
              break;
          case 4:
              holder.img_fweather.setImageResource(Imageutil.getImageResouce(bodybeans.getF5beans().getDay_weather()));
              holder.tv_daytemp.setText(bodybeans.getF5beans().getDay_temp()+"℃");
              holder.tv_nighttemp.setText(bodybeans.getF5beans().getNight_temp()+"℃");
               week=bodybeans.getF5beans().getWeekday();
              if (week.equals("7")){
                  week="日";
              }
              holder.tv_week.setText("星期"+week);
              break;
          case 5:
              holder.img_fweather.setImageResource(Imageutil.getImageResouce(bodybeans.getF6beans().getDay_weather()));
              holder.tv_daytemp.setText(bodybeans.getF6beans().getDay_temp()+"℃");
              holder.tv_nighttemp.setText(bodybeans.getF6beans().getNight_temp()+"℃");
               week=bodybeans.getF6beans().getWeekday();
              if (week.equals("7")){
                  week="日";
              }
              holder.tv_week.setText("星期"+week);
              break;
          case 6:
              holder.img_fweather.setImageResource(Imageutil.getImageResouce(bodybeans.getF7beans().getDay_weather()));
              holder.tv_daytemp.setText(bodybeans.getF7beans().getDay_temp()+"℃");
              holder.tv_nighttemp.setText(bodybeans.getF7beans().getNight_temp()+"℃");
               week=bodybeans.getF7beans().getWeekday();
              if (week.equals("7")){
                  week="日";
              }
              holder.tv_week.setText("星期"+week);
              break;
      }


    }

    @Override
    public int getItemCount() {
        return 7;
    }

    class Weatherviewholder extends RecyclerView.ViewHolder{
        TextView tv_daytemp,tv_nighttemp,tv_week;
        ImageView img_fweather;

        public Weatherviewholder(@NonNull View itemView) {
            super(itemView);
            tv_daytemp=itemView.findViewById(R.id.tv_daytemp);
            tv_nighttemp=itemView.findViewById(R.id.tv_nighttemp);
            tv_week=itemView.findViewById(R.id.tv_week);
            img_fweather=itemView.findViewById(R.id.img_fweather);
        }
    }
}
