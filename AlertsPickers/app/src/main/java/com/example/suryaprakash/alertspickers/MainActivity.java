package com.example.suryaprakash.alertspickers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner country_selector;
    String[] country_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        country_selector = (Spinner) findViewById(R.id.spinner) ;
        country_list = getResources().getStringArray(R.array.countries);

        ArrayAdapter adapter = new ArrayAdapter( MainActivity.this, android.R.layout.simple_list_item_1 , country_list );

        country_selector.setAdapter(adapter);
        country_selector.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, country_selector.getSelectedItem().toString() , Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}
