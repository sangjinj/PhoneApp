package com.hanbit.user.phoneapp;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;

/**
 * Created by 1027 on 2016-07-16.
 */
public class Phone {
    private Context context;
    private Activity act;


    public Phone(Context context, Activity act) {
        this.context = context;
        this.act = act;
    }

    public void dial(String phoneNo) {
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phoneNo));
        context.startActivity(intent);
    }

    ;

    public void call(String phoneNo) {
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + phoneNo));
        if (ActivityCompat.checkSelfPermission(context, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(act, new String[]{Manifest.permission.CALL_PHONE},2);

            return;
        }
        context.startActivity(intent);
    };


}
