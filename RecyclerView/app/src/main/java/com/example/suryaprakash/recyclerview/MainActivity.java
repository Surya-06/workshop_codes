package com.example.suryaprakash.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycler_view ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler_view = (RecyclerView) findViewById( R.id.recycler_view );

        int[] images = new int[10];
        for(int i=0;i<10;i++)
            images[i] = R.mipmap.ic_launcher;

        String[] cities = getResources().getStringArray(R.array.cities);

        City_Adapter city_adapter= new City_Adapter( MainActivity.this, cities, images ) ;

        recycler_view.setAdapter(city_adapter);
        recycler_view.setLayoutManager ( new LinearLayoutManager(MainActivity.this) );

    }
}
