package com.example.androidstudiolab5;

import android.animation.ObjectAnimator;
import android.widget.Button;

public interface AnimatorFactory {
    ObjectAnimator createAnimator(Button animateButton);
}
