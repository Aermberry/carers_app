package com.example.hkag_app_android.utility;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import androidx.annotation.NonNull;

public class Launcher {
    public void openWebPage(@NonNull Context packageContext, String url) {
        Uri uri = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        packageContext.startActivity(intent);
    }

    public void navigateToPage(@NonNull Context packageContext, Class<?> cls) {
        packageContext.startActivity(new Intent(packageContext, cls));
    }
}
