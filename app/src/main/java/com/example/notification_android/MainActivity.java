package com.example.notification_android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.Notification;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.notification_android.models.CreateChannel;

public class MainActivity extends AppCompatActivity {
    Button btnnavigation1, btnvagigation2;
    private NotificationManagerCompat notificationManagerCompat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnnavigation1 = findViewById(R.id.btnnotification1);
        btnvagigation2 = findViewById(R.id.btnnotification2);
        CreateChannel channel1 = new CreateChannel(this);
        channel1.createChannel();
        notificationManagerCompat = NotificationManagerCompat.from(this);
        btnnavigation1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Displaynotification();
            }
        });
        btnvagigation2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Displaynotification2();
            }
        });
    }

    public void Displaynotification() {
        Notification notification = new NotificationCompat.Builder(this, CreateChannel.Channel_1)
                .setSmallIcon(R.drawable.ic_email_black_24dp)
                .setContentTitle("First Message")
                .setContentText("First message body")
                .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                .build();
        notificationManagerCompat.notify(1, notification);
    }

    public void Displaynotification2() {
        Notification notification = new NotificationCompat.Builder(this, CreateChannel.Channel_2)
                .setSmallIcon(R.drawable.ic_face_black_24dp)
                .setContentTitle("Second Message")
                .setContentText("Second message body")
                .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                .build();
        notificationManagerCompat.notify(2, notification);
    }
}
