package com.example.hkag_app_android.information.ui.contact_information;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hkag_app_android.R;
import com.example.hkag_app_android.utility.Launcher;

public class ContactInformationActivity extends AppCompatActivity {
    private final Launcher _launcher = new Launcher();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_contact_information);
    }

    public void onBackToHomeNavigationPage(View view) {
        _launcher.pop(this);
    }
}
