package com.example.androidstudiolab5;

import android.animation.ObjectAnimator;
import android.widget.Button;

public class DownAnimatorFactory implements AnimatorFactory {
    @Override
    public ObjectAnimator createAnimator(Button animateButton) {
        return ObjectAnimator.ofFloat(animateButton, "translationY", 400);
    }
}
