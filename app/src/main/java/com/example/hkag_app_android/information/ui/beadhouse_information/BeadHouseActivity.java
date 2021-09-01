package com.example.hkag_app_android.information.ui.beadhouse_information;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hkag_app_android.R;

public class BeadHouseActivity extends AppCompatActivity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_beadhouse);

    }

    public void onBackToHomeNavigationPage(View view) {
        finish();
    }
}
