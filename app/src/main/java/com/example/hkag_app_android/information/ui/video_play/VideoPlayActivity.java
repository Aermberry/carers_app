package com.example.hkag_app_android.information.ui.video_play;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hkag_app_android.R;

public class VideoPlayActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.video_play_page);

    }

    public void onBackToHomeNavigationPage(View view) {
        finish();
    }
}
