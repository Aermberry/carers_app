package com.example.hkag_app_android.domain;

public class NavigationItem {
    int image;
    String title;

    public NavigationItem(int image, String title) {
        this.image = image;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public int getImage() {
        return image;
    }
}
