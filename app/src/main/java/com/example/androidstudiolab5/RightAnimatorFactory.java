package com.example.androidstudiolab5;

import android.animation.ObjectAnimator;
import android.widget.Button;

public class RightAnimatorFactory implements AnimatorFactory {
    @Override
    public ObjectAnimator createAnimator(Button animateButton) {
        return ObjectAnimator.ofFloat(animateButton, "translationX", 400);
    }
}
