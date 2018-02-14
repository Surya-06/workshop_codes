package com.example.suryaprakash.recyclerview;


import android.content.Context;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class City_Adapter extends RecyclerView.Adapter <City_Adapter.City_View_Holder> {

    String[] cities;
    int[] images;
    MainActivity context;

    public City_Adapter(MainActivity  mainActivity, String[] cities, int[] images) {
        context = mainActivity;
        this.cities = cities;
        this.images = images;
    }

    @Override
    public City_Adapter.City_View_Holder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater layout_inflater = LayoutInflater.from(context);
        View final_image = layout_inflater.inflate(R.layout.row_layout, parent , false );
        return new City_View_Holder( final_image );

    }

    @Override
    public void onBindViewHolder(City_Adapter.City_View_Holder holder, int position) {

        holder.image_view.setImageResource(images[position]);
        holder.text_view.setText(cities[position]);

    }

    @Override
    public int getItemCount() {
        return images.length ;
    }

    public class City_View_Holder extends  RecyclerView.ViewHolder {

        ImageView image_view ;
        TextView text_view;

        public City_View_Holder(View itemView) {
            super(itemView);
            image_view = (ImageView) itemView.findViewById(R.id.row_layout_imageview);
            text_view  = (TextView) itemView.findViewById(R.id.row_layout_textview);
        }
    }
}
