package com.example.hkag_app_android.information.ui.latest_events;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hkag_app_android.R;

public class LatestEventsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.latest_events_page);
    }

    public void onBackToHomeNavigationPage(View view) {
        finish();
    }
}
