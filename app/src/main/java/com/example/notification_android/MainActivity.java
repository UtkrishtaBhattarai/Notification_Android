package com.example.notification_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btnnavigation1,btnvagigation2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnnavigation1=findViewById(R.id.btnnotification1);
        btnvagigation2=findViewById(R.id.btnnotification2);

    }
}
