package com.example.suryaprakash.alerts;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

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
}
