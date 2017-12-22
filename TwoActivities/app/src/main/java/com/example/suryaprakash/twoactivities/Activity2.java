package com.example.suryaprakash.twoactivities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        String intent_message = getIntent().getStringExtra("key" );

        TextView display_message = (TextView) findViewById( R.id.text_view_second_screen );
        display_message.setText(intent_message);

        return;
    }
}
