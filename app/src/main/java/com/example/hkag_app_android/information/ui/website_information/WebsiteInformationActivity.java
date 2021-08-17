package com.example.hkag_app_android.information.ui.website_information;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.hkag_app_android.R;

public class WebsiteInformationActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.website_information_page);
    }

    public void onBackToHomeNavigationPage(View view) {
        finish();
    }
}
