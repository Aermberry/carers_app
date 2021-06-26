package com.example.hkag_app_android.activity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hkag_app_android.R;
import com.example.hkag_app_android.domain.PageItem;


public class MainActivity extends AppCompatActivity {
    private PageItem[] data = {new PageItem("beadhouse_icon", "選擇安老院舍"), new PageItem("video_icon", "護老技巧示範短片"), new PageItem("online_icon", "院舍網上學習平台"), new PageItem("event_icon", "最新活動資訊"), new PageItem("workshop_icon", "護老者工作坊"), new PageItem("information_icon", "護老者資訊"), new PageItem("project_icon", "計劃簡介"), new PageItem("contact_icon", "聯絡我們")};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.home_navigation);

        ArrayAdapter<PageItem> adapter = new ArrayAdapter<PageItem>(MainActivity.this, R.layout.home_navigation, data);

        ListView navigationItemListView=(ListView)findViewById(R.id.navigationItemList);

        navigationItemListView.setAdapter(adapter);



    }
}