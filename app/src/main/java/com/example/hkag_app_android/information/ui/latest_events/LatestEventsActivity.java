package com.example.hkag_app_android.information.ui.latest_events;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hkag_app_android.R;
import com.example.hkag_app_android.utility.Launcher;

public class LatestEventsActivity extends AppCompatActivity {
    private final Launcher _launcher = new Launcher();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latest_events);
    }

    public void onBackToHomeNavigationPage(View view) {
        _launcher.pop(this);
    }
}
