package com.example.hkag_app_android.home.ui.home_navigation.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.hkag_app_android.R;
import com.example.hkag_app_android.domain.NavigationItem;

public class NavigationAdapter extends ArrayAdapter<NavigationItem> {
    private final int mResource;
    private final Context mContext;

    public NavigationAdapter(@NonNull Context context, int resource, @NonNull NavigationItem[] objects) {
        super(context, resource, objects);

        this.mContext = context;
        this.mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        ///动态加载布局文件：https://blog.csdn.net/guolin_blog/article/details/12921889
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);

        convertView = layoutInflater.inflate(mResource, parent, false);

        ImageView image=convertView.findViewById(R.id.navigation_item);
        TextView textName=convertView.findViewById(R.id.navigation_item_title);

        image.setImageResource(getItem(position).getImage());
        textName.setText(getItem(position).getTitle());

        return convertView;
    }
}
