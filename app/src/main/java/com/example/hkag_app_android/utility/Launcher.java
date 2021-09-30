package com.example.hkag_app_android.utility;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public class Launcher {
    public void openWebPage(Context packageContext, String url) {
        Uri uri = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        packageContext.startActivity(intent);
    }

    public void navigateToPage(Context packageContext, Class<?> cls) {
        packageContext.startActivity(new Intent(packageContext, cls));
    }
}
