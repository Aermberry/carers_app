package com.example.hkag_app_android.setting.ui.setting;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import com.example.hkag_app_android.R;

public class AppSettingActivity extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.app_setting_page);
    }

    public void onBackToHomeNavigationPage(View view) {
    }
}
