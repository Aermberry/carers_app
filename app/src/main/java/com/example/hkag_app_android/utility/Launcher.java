package com.example.hkag_app_android.utility;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Launcher {
    public void openWebPage(@NonNull Context packageContext, String url) {
        Uri uri = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        packageContext.startActivity(intent);
    }

    public void navigateToPage(@NonNull Context packageContext, @NonNull Class<?> cls, @Nullable Class<?>... parameter) {

        Intent intent = new Intent(packageContext, cls);

        if (parameter != null) {
            intent.putExtra("parameter", parameter);
        }
        packageContext.startActivity(intent);
    }

    public void pop(@NonNull Activity activity) {
        activity.finish();
    }
}
