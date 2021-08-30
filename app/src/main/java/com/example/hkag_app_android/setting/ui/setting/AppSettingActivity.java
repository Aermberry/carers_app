package com.example.hkag_app_android.setting.ui.setting;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hkag_app_android.R;

public class AppSettingActivity extends AppCompatActivity {


    @SuppressLint("UseSwitchCompatOrMaterialCode")
    Switch switchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.app_setting_page);

        switchButton = (Switch) findViewById(R.id.switch_button);

        switchButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(getBaseContext(), isChecked ? "On" : "Off", Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void onBackToHomeNavigationPage(View view) {
        finish();
    }
}
