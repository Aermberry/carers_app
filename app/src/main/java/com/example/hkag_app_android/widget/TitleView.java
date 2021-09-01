package com.example.hkag_app_android.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.example.hkag_app_android.R;

public class TitleView extends LinearLayout {
    private ImageView _imageView;
    private TextView _textView;

    private String _textTitle;
    private int _image;
    private static final String TAG = "TitleLayout";


    public TitleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        LayoutInflater.from(context).inflate(R.layout.view_title, this);

        TypedArray widgets = context.obtainStyledAttributes(attrs, R.styleable.TitleView);

        _imageView = findViewById(R.id.view_title_icon);
        _textView = findViewById(R.id.view_title_title);

        _textTitle = widgets.getString(R.styleable.TitleView_title);
        _image = widgets.getResourceId(R.styleable.TitleView_image, 0);

        widgets.recycle();

        _textView.setText(_textTitle);
        _imageView.setImageResource(_image);

    }

}
