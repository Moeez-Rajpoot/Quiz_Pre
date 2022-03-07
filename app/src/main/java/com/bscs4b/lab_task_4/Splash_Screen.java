package com.bscs4b.lab_task_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Splash_Screen extends AppCompatActivity {

    ImageView Pic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Pic=findViewById(R.id.imageView4);

        Animation animation;
        animation = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.rotate);
        Pic.startAnimation(animation);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //This method will be executed once the timer is over
                // Start your app main activity
                Intent i = new Intent(Splash_Screen.this, MainActivity.class);
                startActivity(i);
                // close this activity
                finish();
            }
        }, 2000);
    }
}