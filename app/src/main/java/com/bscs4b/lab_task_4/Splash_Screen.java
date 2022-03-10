package com.bscs4b.lab_task_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash_Screen extends AppCompatActivity {

    ImageView Pic;
    TextView name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Pic=findViewById(R.id.imageView4);
        name=findViewById(R.id.textView2);

        Animation animation;
        animation = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.rotate);
        Pic.startAnimation(animation);

        Animation animation1;
        animation1 = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.fade);
        name.startAnimation(animation1);
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