package com.example.shivangi.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    AnimationDrawable animationDrawable;
    Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView frameImg = findViewById(R.id.danceImg);
        frameImg.setBackgroundResource(R.drawable.animation);
        animationDrawable = (AnimationDrawable) frameImg.getBackground();

        TextView dance = findViewById(R.id.textView);
        animation = AnimationUtils.loadAnimation(this,R.anim.rotate);
        dance.startAnimation(animation);

    }


    public void startFrame(View view) {
        animationDrawable.start();
    }

    public void stopFrame(View view) {
        animationDrawable.stop();
    }
}