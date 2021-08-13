package com.example.hkag_app_android.information.ui.beadhouse_information;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.hkag_app_android.R;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class BeadHouseActivity extends AppCompatActivity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.beadhouse_page);

    }

    public void onBackToHomeNavigationPage(View view) {
        finish();
    }
}
