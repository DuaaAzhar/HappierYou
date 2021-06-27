package com.example.happieryou;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.tabs.TabLayout;


public class DuaasAnger extends AppCompatActivity {
    ViewPager simpleViewPager;
    TabLayout tabLayout;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.duaas_anger_activity);
        init();
// Create a new Tab named "First"
        TabLayout.Tab firstTab = tabLayout.newTab();
        firstTab.setText("Islamic Tips"); // set the Text for the first Tab
        firstTab.setIcon(R.drawable.ictips); // set an icon for the
// first tab
        tabLayout.addTab(firstTab); // add  the tab at in the TabLayout
// Create a new Tab named "Second"
        TabLayout.Tab secondTab = tabLayout.newTab();
        secondTab.setText("Duaas"); // set the Text for the second Tab
        secondTab.setIcon(R.drawable.icduaa); // set an icon for the second tab
        tabLayout.addTab(secondTab); // add  the tab  in the TabLayout

        PagerAdapter adapter = new com.example.happieryou.PagerAdapter(getSupportFragmentManager(),2);
        simpleViewPager.setAdapter(adapter);
// addOnPageChangeListener event change the tab on slide
        simpleViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }
    @SuppressLint("WrongViewCast")
    public void init(){
        // get the reference of ViewPager and TabLayout
        simpleViewPager = (ViewPager) findViewById(R.id.simpleViewPager);
        tabLayout =findViewById(R.id.simpleTabLayout);

    }
}