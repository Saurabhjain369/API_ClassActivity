package com.example.classactivity2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashScreenActivity extends AppCompatActivity {
    ImageView app_logo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        app_logo = findViewById(R.id.app_logo);

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotation);
        animation.setDuration(5000);
        app_logo.setAnimation(animation);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashScreenActivity.this,MainActivity.class);
                startActivity(i);
                finish();

            }
        },6000);
    }
}
