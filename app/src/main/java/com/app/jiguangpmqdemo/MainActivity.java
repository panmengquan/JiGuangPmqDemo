package com.app.jiguangpmqdemo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import cn.jpush.android.api.JPushInterface;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String registrationID = JPushInterface.getRegistrationID(this);
        JPushInterface.setAlias(this, 1, registrationID);
    }
}
