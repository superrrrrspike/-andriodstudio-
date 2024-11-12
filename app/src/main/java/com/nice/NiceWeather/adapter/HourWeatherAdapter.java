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

public class HourWeatherAdapter extends RecyclerView.Adapter<HourWeatherAdapter.Weatherviewholder> {
    private Context context;
    private bodyBeans bodybeans;

    public HourWeatherAdapter(Context inicontext,bodyBeans inibodybeans) {
        context=inicontext;
        bodybeans=inibodybeans;


    }

    @NonNull
    @Override
    public Weatherviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(context).inflate(R.layout.recycle_hour_layout,parent,false);
        Weatherviewholder wh =new Weatherviewholder(view);
        return wh;
    }

    @Override
    public void onBindViewHolder(@NonNull Weatherviewholder holder, int position) {
        holder.img_hweather.setImageResource(Imageutil.getImageResouce(bodybeans.getF1beans().getHourForcast().get(position).getWeather()));
        holder.tv_htemp.setText(bodybeans.getF1beans().getHourForcast().get(position).getTemp()+"℃");
        holder.tv_htime.setText(bodybeans.getF1beans().getHourForcast().get(position).getHour());


    }

    @Override
    public int getItemCount() {
        return bodybeans.getF1beans().getHourForcast().size();

    }

    class Weatherviewholder extends RecyclerView.ViewHolder{
        TextView tv_htemp;
        TextView tv_htime;
        ImageView img_hweather;


        public Weatherviewholder(@NonNull View itemView) {
            super(itemView);
            tv_htemp=itemView.findViewById(R.id.tv_htemp);
            tv_htime=itemView.findViewById(R.id.tv_htime);
            img_hweather=itemView.findViewById(R.id.img_hweather);

        }
    }
}
