package com.example.suryaprakash.new_application_3rd_workshop;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    TabLayout tab_layout ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tab_layout = (TabLayout) findViewById(R.id.tab_layout);
        tab_layout.addTab(tab_layout.newTab().setText("Chats"));
        tab_layout.addTab(tab_layout.newTab().setText("Status"));
        tab_layout.addTab(tab_layout.newTab().setText("Internet Calling"));

        tab_layout.setTabGravity(tab_layout.GRAVITY_FILL);

        ViewPager view_pager = (ViewPager) findViewById( R.id.view_pager );

        pager_adapter page_adapt = new pager_adapter ( getSupportFragmentManager() , tab_layout.getTabCount() );



    }
}
