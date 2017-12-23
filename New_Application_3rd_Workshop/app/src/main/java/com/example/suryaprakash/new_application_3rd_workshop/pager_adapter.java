package com.example.suryaprakash.new_application_3rd_workshop;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class pager_adapter extends FragmentStatePagerAdapter {

    int tab_count ;

    public pager_adapter(FragmentManager fm, int tabCount ) {
        super(fm);
        tab_count = tabCount;
    }


    @Override
    public Fragment getItem(int position) {
        switch(position) {
            case 0:
                return new Chats();
            case 1:
                return new status();
            case 2:
                return new internet_calls();
        }
        return null;
    }

    @Override
    public int getCount() {
        return tab_count;
    }
}
