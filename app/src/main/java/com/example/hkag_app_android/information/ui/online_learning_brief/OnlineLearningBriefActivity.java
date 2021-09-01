package com.example.hkag_app_android.information.ui.online_learning_brief;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hkag_app_android.R;

public class OnlineLearningBriefActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_online_learning_brief);
    }

    public void onBackToHomeNavigationPage(View view) {
        finish();
    }
}
