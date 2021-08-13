package com.example.hkag_app_android.home.ui.home_navigation.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

public class NavigationList extends ListView {

    public NavigationList(Context context) {
        super(context);
    }

    public NavigationList(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public NavigationList(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int measuredHeight = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2, MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, measuredHeight);
    }
}
