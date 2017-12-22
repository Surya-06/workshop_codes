package com.example.suryaprakash.twoactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    Button next_screen_button;
    EditText input_text , phone_number ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        next_screen_button = (Button) findViewById(R.id.next_activity_button);
        input_text = (EditText) findViewById(R.id.text_input);

        next_screen_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                phone_number = (EditText) findViewById( R.id.phone_number );

                String entered_number = phone_number.getText().toString();

                Pattern phone_number_pattern = Pattern.compile( "[7-9]+[0-9]+");

                if ( entered_number.length()==10 ) {
                    Matcher m = phone_number_pattern.matcher ( entered_number );
                    if ( m.matches() ) {
                        Toast.makeText(MainActivity.this, "Valid Phone Number Entered ", Toast.LENGTH_SHORT).show();
                        String input_value = input_text.getText().toString();
                        Intent intent = new Intent ( MainActivity.this, Activity2.class ) ;
                        intent . putExtra( "key" , input_value ) ;
                        startActivity( intent );
                    }
                    else {
                        phone_number.setError("Wrong Number / Number does not exist ");
                        Toast.makeText(MainActivity.this, "Wrong Number / Number does not exist ", Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    phone_number.setError("Invalid Phone Number Entered");
                    Toast.makeText(MainActivity.this, "Invalid Phone Number Entered", Toast.LENGTH_SHORT).show();
                }


            }
        });

    }
}
