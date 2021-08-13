package com.example.hkag_app_android.information.ui.contact_information;

import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.hkag_app_android.R;

public class ContactInformationActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

        setContentView(R.layout.contact_information_page);
    }
}
