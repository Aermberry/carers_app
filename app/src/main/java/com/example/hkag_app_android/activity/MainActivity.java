package com.example.hkag_app_android.activity;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hkag_app_android.R;
import com.example.hkag_app_android.domain.NavigationItem;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.home_navigation);

        ListView navigationItemListView = (ListView) findViewById(R.id.navigationItemList);

        NavigationItem[] data = {
                new NavigationItem(R.drawable.beadhouse_icon, "選擇安老院舍"),
                new NavigationItem(R.drawable.video_icon, "護老技巧示範短片"),
                new NavigationItem(R.drawable.online_icon, "院舍網上學習平台"),
                new NavigationItem(R.drawable.event_icon, "最新活動資訊"),
                new NavigationItem(R.drawable.workshop_icon, "護老者工作坊"),
                new NavigationItem(R.drawable.information_icon, "護老者資訊"),
                new NavigationItem(R.drawable.project_icon, "計劃簡介"),
                new NavigationItem(R.drawable.contact_icon, "聯絡我們")};

        NavigationAdapter navigationAdapter = new NavigationAdapter(this,R.layout.navigation_item,data);
        navigationItemListView.setAdapter(navigationAdapter);
    }
}