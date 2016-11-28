package com.example.helloworld;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViewPager();
    }
   
    private void initViewPager(){
     ViewPager viewPager = (ViewPager)findViewById(R.id.viewPager);
     
     View view1 = LayoutInflater.from(this).inflate(R.layout.layout1, null);
     View view2 = LayoutInflater.from(this).inflate(R.layout.layout2, null);
     View view3 = LayoutInflater.from(this).inflate(R.layout.layout3, null);
     
     ArrayList<View> views = new ArrayList<View>();
     views.add(view1);
     views.add(view2);
     views.add(view3);
     
     MYViewPagerAdapter adapter = new MYViewPagerAdapter();
     adapter.setViews(views);
     viewPager.setAdapter(adapter);
    }
}
