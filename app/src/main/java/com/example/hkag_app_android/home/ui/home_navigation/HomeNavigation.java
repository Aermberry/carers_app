package com.example.hkag_app_android.home.ui.home_navigation;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hkag_app_android.R;
import com.example.hkag_app_android.domain.NavigationItem;
import com.example.hkag_app_android.information.ui.beadhouse_information.BeadHouseActivity;
import com.example.hkag_app_android.home.ui.home_navigation.widget.NavigationAdapter;
import com.example.hkag_app_android.information.ui.contact_information.ContactInformationActivity;
import com.example.hkag_app_android.information.ui.video_play.VideoPlayActivity;

import java.util.List;


public class HomeNavigation extends AppCompatActivity {
    ListView _navigationItemListView;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.home_navigation);

        ListView _navigationItemListView = (ListView) findViewById(R.id.navigationItemList);

        NavigationItem[] data = {
                new NavigationItem(R.drawable.beadhouse_icon, "選擇安老院舍"),
                new NavigationItem(R.drawable.video_icon, "護老技巧示範短片"),
                new NavigationItem(R.drawable.online_icon, "院舍網上學習平台"),
                new NavigationItem(R.drawable.event_icon, "最新活動資訊"),
                new NavigationItem(R.drawable.workshop_icon, "護老者工作坊"),
                new NavigationItem(R.drawable.information_icon, "護老者資訊"),
                new NavigationItem(R.drawable.project_icon, "計劃簡介"),
                new NavigationItem(R.drawable.contact_icon, "聯絡我們")};

        NavigationAdapter navigationAdapter = new NavigationAdapter(this, R.layout.navigation_item, data);
        _navigationItemListView.setAdapter(navigationAdapter);

        _navigationItemListView.setOnTouchListener((v, event) -> (event.getAction() == MotionEvent.ACTION_MOVE));

        _navigationItemListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(HomeNavigation.this, id + "", Toast.LENGTH_LONG).show();

                Intent intent = null;

                switch ((int) id) {
                    case 0:
                        intent = new Intent(HomeNavigation.this, BeadHouseActivity.class);
                        break;
                    case 1:
                        intent = new Intent(HomeNavigation.this, VideoPlayActivity.class);
                        break;
                    case 2:
                        intent = new Intent(HomeNavigation.this, VideoPlayActivity.class);
                        break;
                    case 3:
                        intent = new Intent(HomeNavigation.this, VideoPlayActivity.class);
                        break;
                    case 4:
                        intent = new Intent(HomeNavigation.this, VideoPlayActivity.class);
                        break;
                    case 5:
                        intent = new Intent(HomeNavigation.this, VideoPlayActivity.class);
                        break;
                    case 6:
                        intent = new Intent(HomeNavigation.this, VideoPlayActivity.class);
                        break;
                    case 7:
                        intent = new Intent(HomeNavigation.this, VideoPlayActivity.class);
                        break;
                    default:
                        break;
                }
                startActivity(intent);
            }
        });
    }


}