package com.example.hkag_app_android.information.ui.workshop_brief;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.hkag_app_android.R;

public class WorkshopBriefActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.workshop_brief_page);
    }

    public void onBackToHomeNavigationPage(View view) {
        finish();
    }
}
