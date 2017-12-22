package com.example.suryaprakash.alerts;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button_method ( View view ) {

        AlertDialog.Builder alert = new AlertDialog.Builder( MainActivity.this );
        alert.setIcon(R.drawable.alert_2);
        alert.setTitle("Exit Prompt :: ");
        alert.setMessage("Are you sure you want to go away ??????? ") ;
        alert.setPositiveButton("Get me Out !", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
                Toast.makeText(MainActivity.this,"Tough luck dude!!!", Toast.LENGTH_LONG ).show();
            }
        });
        alert.setNegativeButton("No!!!!!!", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });

        alert.show();

        return;
    }

    public void date_picker ( View view ) {
        Intent intent = new Intent(MainActivity.this , Main2Activity.class ) ;
        startActivity(intent);
    }
}
