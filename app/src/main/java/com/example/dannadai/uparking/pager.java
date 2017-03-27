package com.example.dannadai.uparking;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by kikii on 3/27/2017.
 */

public class pager extends FragmentStatePagerAdapter {
    int tabCount;
    public Pager(FragmentManager fm, int tabCount){
        super(fm);
        this.tabCount = tabCount;
    }
public Fragment getItem(int position){
    switch (position){
        case 0:
            Tab1 history = new Tab1();
            return history;
        case 0:
            Tab1 payment = new Tab1();
            return payment;
        case 0:
            Tab1 saved = new Tab1();
            return saved;
        case 0:
            Tab1 help = new Tab1();
            return help;
        case 0:
            Tab1 settings = new Tab1();
            return settings;
    }
}

public int getCount() {
    return tabCount;
}
}