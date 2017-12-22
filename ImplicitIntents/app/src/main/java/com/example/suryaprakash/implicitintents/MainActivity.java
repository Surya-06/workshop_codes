package com.example.suryaprakash.implicitintents;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.content.Intent.ACTION_VIEW;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button url, location , text;
        final EditText url_input , location_input, text_input;

        url = (Button) findViewById(R.id.url_submit);
        location = (Button) findViewById(R.id.location_submit);
        text = (Button) findViewById(R.id.text_submit);

        url_input = (EditText)findViewById(R.id.url_input);
        location_input = (EditText) findViewById(R.id.location_input);
        text_input = (EditText) findViewById(R.id.text_input);

        url.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri page = Uri.parse("http://"+url_input.getText().toString());
                Intent intent = new Intent( Intent.ACTION_VIEW , page );
                startActivity(intent);
            }
        });

        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri location_value = Uri.parse("geo:0,0?q="+location_input.getText().toString());
                Intent intent = new Intent( ACTION_VIEW , location_value );
                startActivity(intent);
            }
        });

        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input_value = text_input.getText().toString();
                String mime = "text/plain";
                ShareCompat.IntentBuilder
                        .from(MainActivity.this)
                        .setType(mime)
                        .setChooserTitle("Share this text using :")
                        .setText ( input_value )
                        .startChooser();
            }
        });

    }
}
