package com.example.hkag_app_android.setting.ui.setting;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Debug;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hkag_app_android.R;
import com.example.hkag_app_android.information.ui.beadhouse_information.ExampleActivity;
import com.example.hkag_app_android.information.ui.contact_information.ContactInformationActivity;
import com.example.hkag_app_android.information.ui.online_learning_brief.OnLineLearningBriefActivity;
import com.example.hkag_app_android.setting.ui.webView.IntellectualPropertyNoticeActivity;
import com.example.hkag_app_android.setting.ui.webView.PrivacyPolicyActivity;
import com.example.hkag_app_android.utility.Launcher;

public class AppSettingActivity extends AppCompatActivity {

    private final Launcher _launcher = new Launcher();

    @SuppressLint("UseSwitchCompatOrMaterialCode")
    private Switch switchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_app_setting);

        switchButton = (Switch) findViewById(R.id.switch_button);

        switchButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(getBaseContext(), isChecked ? "On" : "Off", Toast.LENGTH_SHORT).show();
            }
        });

        this.initView();

    }

    private void initView() {
        Button _networkLearningButton = (Button) findViewById(R.id.privacy_policy_button);
        Button _intellectualPropertyNoticeButton = (Button) findViewById(R.id.intellectual_property_notice_button);

        _networkLearningButton.setOnClickListener(new AppSettingActivity.MyClickListener());
        _intellectualPropertyNoticeButton.setOnClickListener(new AppSettingActivity.MyClickListener());


    }

    class MyClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.privacy_policy_button:
//                    _launcher.navigateToPage(AppSettingActivity.this, PrivacyPolicyActivity.class);
                    _launcher.navigateToPage(AppSettingActivity.this, ExampleActivity.class);
                    break;

                case R.id.intellectual_property_notice_button:
                    _launcher.navigateToPage(AppSettingActivity.this, IntellectualPropertyNoticeActivity.class);
                    break;
                default:
                    break;
            }
        }
    }

    public void onBackToHomeNavigationPage(View view) {
        _launcher.pop(this);
    }
}
