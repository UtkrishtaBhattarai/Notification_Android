package com.example.notification_android.models;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.widget.Toast;

public class BroadcastReceiverExample extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        boolean noconnectivity;
            // test
        if (ConnectivityManager.CONNECTIVITY_ACTION.equals(intent.getAction()))
        {
            noconnectivity=intent.getBooleanExtra(ConnectivityManager.EXTRA_NO_CONNECTIVITY,false);

            if (noconnectivity)
            {
                Toast.makeText(context, "Disconnected", Toast.LENGTH_SHORT).show();
            }
            else
            {
                Toast.makeText(context, "Connected", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
