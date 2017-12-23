package com.example.suryaprakash.alerts;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void open_date ( View view ) {
            PickerFragment picker = new PickerFragment();
            FragmentManager fm = getFragmentManager();
            picker.show( fm , "Date Picker Fragment");
    }

    public void useDate ( int year, int month , int day ) {
        String y = String.valueOf(year);
        String m = String.valueOf(month);
        String d = String.valueOf(day);
        Toast.makeText(Main2Activity.this, d+"/"+m+"/"+y , Toast.LENGTH_LONG) .show();
        return;
    }
}
