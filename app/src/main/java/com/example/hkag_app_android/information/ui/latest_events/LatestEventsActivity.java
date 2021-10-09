package com.example.hkag_app_android.information.ui.latest_events;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hkag_app_android.R;
import com.example.hkag_app_android.information.ui.contact_information.ContactInformationActivity;
import com.example.hkag_app_android.setting.ui.setting.AppSettingActivity;
import com.example.hkag_app_android.setting.ui.webView.IntellectualPropertyNoticeActivity;
import com.example.hkag_app_android.setting.ui.webView.PrivacyPolicyActivity;
import com.example.hkag_app_android.utility.Launcher;

public class LatestEventsActivity extends AppCompatActivity {
    private final Launcher _launcher = new Launcher();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latest_events);

        initView();
    }

    private void initView() {
        Button _lastEventContactUsButton = (Button) findViewById(R.id.last_event_contact_us_button);

        _lastEventContactUsButton.setOnClickListener(new LatestEventsActivity.MyClickListener());
    }

    public void onBackToHomeNavigationPage(View view) {
        _launcher.pop(this);
    }

    class MyClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            _launcher.navigateToPage(LatestEventsActivity.this, ContactInformationActivity.class);
        }
    }
}


