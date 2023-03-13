package com.example.androidstudiolab5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button right = findViewById(R.id.right);
        Button left = findViewById(R.id.left);
        Button up = findViewById(R.id.up);
        Button down = findViewById(R.id.down);
        right.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, AnimationActivity.class);
            intent.putExtra("animation_direction", "right");
            startActivity(intent);
        });
        left.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, AnimationActivity.class);
            intent.putExtra("animation_direction", "left");
            startActivity(intent);
        });
        up.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, AnimationActivity.class);
            intent.putExtra("animation_direction", "up");
            startActivity(intent);
        });
        down.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, AnimationActivity.class);
            intent.putExtra("animation_direction", "down");
            startActivity(intent);
        });
    }
}


