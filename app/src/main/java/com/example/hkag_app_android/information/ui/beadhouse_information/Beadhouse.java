package com.example.hkag_app_android.information.ui.beadhouse_information;

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
    private ArrayList<Fragment> fragments = new ArrayList<>();
    private String[] titles = new String[]{"最新","热门","我的"};


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.beadhouse_page);

    }

}
