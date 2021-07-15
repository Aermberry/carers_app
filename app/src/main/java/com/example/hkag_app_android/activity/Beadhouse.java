package com.example.hkag_app_android.activity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.hkag_app_android.R;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class Beadhouse extends AppCompatActivity {
    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private FmPagerAdapter pagerAdapter;
    private ArrayList<Fragment> fragments = new ArrayList<>();
    private String[] titles = new String[]{"最新","热门","我的"};


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.beadhouse_page);

    }

    private void init() {

        mTabLayout = (TabLayout) findViewById(R.id.tab_layout);
        mViewPager = (ViewPager) findViewById(R.id.view_pager);

        for(int i=0;i<titles.length;i++){
            fragments.add(new TabFragment());
            mTabLayout.addTab(mTabLayout.newTab());
        }

        mTabLayout.setupWithViewPager(mViewPager,false);
        pagerAdapter = new FmPagerAdapter(fragments,getSupportFragmentManager());
        mViewPager.setAdapter(pagerAdapter);

        for(int i=0;i<titles.length;i++){
            mTabLayout.getTabAt(i).setText(titles[i]);
        }
    }
}
