package com.example.hkag_app_android.information.ui.video_play;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hkag_app_android.R;
import com.example.hkag_app_android.utility.Launcher;

public class VideoPlayActivity extends AppCompatActivity {
    private final Launcher _urlLauncher = new Launcher();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_video_play);

    }

    public void onBackToHomeNavigationPage(View view) {
        _urlLauncher.pop(this);
    }
}
