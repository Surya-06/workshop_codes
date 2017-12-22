package com.example.suryaprakash.workshop_tester;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    Button b;
    int count_value = 0;
    TextView text_box;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_linear);


        b = (Button) findViewById( R.id.counter );

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count_value++;
                text_box = (TextView)findViewById(R.id.text_box);
                text_box.setText(String.valueOf(count_value));
            }
        });

    }


    // another function for generating toast message
    public void toaster(View view) {
        Toast.makeText(this,R.string.toast_message,Toast.LENGTH_LONG).show();
        return;
    }

    public void toaster_french ( View view ) {
        Toast.makeText(this,"French Toast ", Toast.LENGTH_SHORT).show();
        return;
    }

}
