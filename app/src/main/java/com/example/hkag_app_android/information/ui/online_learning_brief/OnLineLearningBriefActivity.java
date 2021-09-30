package com.example.hkag_app_android.information.ui.online_learning_brief;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hkag_app_android.R;
import com.example.hkag_app_android.information.ui.contact_information.ContactInformationActivity;
import com.example.hkag_app_android.utility.Launcher;

public class OnLineLearningBriefActivity extends AppCompatActivity {

    private final Launcher _urlLauncher = new Launcher();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_online_learning_brief);

        initView();
    }

    private void initView() {
        Button _networkLearningButton = (Button) findViewById(R.id.network_learning_button);
        Button _contactButton = (Button) findViewById(R.id.contact_us_button);


        _networkLearningButton.setOnClickListener(new MyClickListener());
        _contactButton.setOnClickListener(new MyClickListener());


    }

    class MyClickListener implements View.OnClickListener {


        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.network_learning_button:
                    _urlLauncher.openWebPage(OnLineLearningBriefActivity.this, "https://www.baidu.com");
                    break;

                case R.id.contact_us_button:
                    _urlLauncher.navigateToPage(OnLineLearningBriefActivity.this, ContactInformationActivity.class);
                    break;
                default:
                    break;
            }
        }
    }

    public void onBackToHomeNavigationPage(View view) {
        _urlLauncher.pop(this);
    }
}
