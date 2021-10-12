package com.example.hkag_app_android.information.ui.beadhouse_information;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import com.example.hkag_app_android.R;
import com.example.hkag_app_android.utility.Launcher;
import com.google.android.material.tabs.TabLayout;

public class BeadHouseActivity extends AppCompatActivity {
    private final Launcher _launcher = new Launcher();
    private TabLayout tabLayout;
    private ViewPager2 viewPager2;
    private FragmentAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_beadhouse);

        this.initView();

    }

    void initView() {
        tabLayout = findViewById(R.id.tab_layout);
        viewPager2 = findViewById(R.id.view_pager2);

        FragmentManager fm = getSupportFragmentManager();
        adapter = new FragmentAdapter(fm, getLifecycle());
        viewPager2.setAdapter(adapter);



        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.eye_icon));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ear_icon));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.mouth_icon));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.konk_icon));


        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                viewPager2.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                tabLayout.selectTab(tabLayout.getTabAt(position));
            }
        });
    }

    public void onBackToHomeNavigationPage(View view) {
        _launcher.pop(this);
    }
}
