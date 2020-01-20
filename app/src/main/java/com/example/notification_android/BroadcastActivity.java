package com.example.notification_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;

import com.example.notification_android.models.BroadcastReceiverExample;

public class BroadcastActivity extends AppCompatActivity {

    BroadcastReceiverExample broadcastReceiverExample=new BroadcastReceiverExample();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broadcast);
    }
    @Override
    protected void onStart()
    {
        super.onStart();
        IntentFilter intentFilter=new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
        registerReceiver(broadcastReceiverExample,intentFilter);
    }
    @Override
    protected void onStop()
    {
        super.onStop();
        unregisterReceiver(broadcastReceiverExample);
    }
}
