package com.example.hkag_app_android.widget;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.example.hkag_app_android.R;

public class TitleLayout extends LinearLayout {
    private static final String TAG = "TitleLayout";

    public TitleLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.view_title_demo, this);

        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.TitleLayout);
        int cout = ta.getIndexCount();
        String title = ta.getNonResourceString(R.styleable.TitleLayout_title);
        Log.d(TAG, title);
        ta.recycle();
        Button titleBack = (Button) findViewById(R.id.title_back);
        Button titleEdit = (Button) findViewById(R.id.title_edit);
        TextView titleText=(TextView) findViewById(R.id.title_text);
        titleText.setText(title);

        titleBack.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Activity) getContext()).finish();
            }
        });

        titleEdit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "You clicked Edit button", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
