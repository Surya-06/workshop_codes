package com.example.suryaprakash.surya_tester_application;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final TextView temp = findViewById(R.id.display);
        temp.setText("temporary display , will be replaced soon ");
        
        findViewById(R.id.submit) . setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new temp_task( temp , 10 ).execute();
            }
        });
    }

    public class temp_task extends AsyncTask < String , String , String >  {
        TextView temp_view;
        int value;

        public temp_task ( TextView temp_view , int value ) {
            this.temp_view = temp_view;
            this.value = value ;
        }


        @Override
        protected String doInBackground(String... strings) {
            int k = 0;
            for ( int i =0 ; i < value ; i++ ) {
                k = k+5 ;
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                publishProgress(Integer.valueOf(k).toString());
            }
            return Integer.valueOf(k).toString();
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);
            temp_view.setText(values[0]);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            temp_view.setText(s);
        }
    }

}
