package com.example.hkag_app_android.activity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.hkag_app_android.R;
import com.google.android.material.tabs.TabLayout;

public class Beadhouse extends AppCompatActivity {
    private TabLayout mTabLayout;
    private ViewPager mViewPager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.beadhouse_page);

    }

    private void initData(){
//        mTabLayout=(TabLayout) findViewById(R.id.tab_layout);
//        mViewPager=(ViewPager)findViewById(R.id.view_pager);

    }
}
