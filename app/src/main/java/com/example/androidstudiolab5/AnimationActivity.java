package com.example.androidstudiolab5;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.widget.Button;

public class AnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);

        Button animateButton = findViewById(R.id.animated_button);
        String animationDirection = getIntent().getStringExtra("animation_direction");
        animateButton.setText("I`m animate in " + animationDirection + "!");

        AnimatorFactory animatorFactory;
        switch (animationDirection) {
            case "left":
                animatorFactory = new LeftAnimatorFactory();
                break;
            case "right":
                animatorFactory = new RightAnimatorFactory();
                break;
            case "up":
                animatorFactory = new UpAnimatorFactory();
                break;
            case "down":
                animatorFactory = new DownAnimatorFactory();
                break;
            default:
                animatorFactory = new LeftAnimatorFactory();
                break;
        }
        ObjectAnimator animation = animatorFactory.createAnimator(animateButton);
        animation.setDuration(10000);
        animation.start();

        Button backButton = findViewById(R.id.back_button);
        backButton.setOnClickListener(v -> onBackPressed());
    }
}