package com.example.hkag_app_android.information.ui.project_brief;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.hkag_app_android.R;

public class ProjectBriefActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_project_brief);
    }

    public void onBackToHomeNavigationPage(View view) {
        finish();
    }
}
