package com.example.bmicalculator;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class StartScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_start_screen);

        new Handler().postDelayed(() -> {
            startActivity(new Intent(StartScreenActivity.this, MainActivity.class));
            finish();
        }, 4000);
    }
}