package com.example.mental;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SwishActivity extends AppCompatActivity {

    private static int SWISH_SCREEN_TIMEOUT = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView((R.layout.swish_activity));

        Animation fadeOut = new AlphaAnimation(1, 0);
        fadeOut.setInterpolator(new AccelerateInterpolator());
        fadeOut.setStartOffset(500);
        fadeOut.setDuration(1800);
        ImageView image = findViewById(R.id.imageView2);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run(){
                Intent intent = new Intent(SwishActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, SWISH_SCREEN_TIMEOUT);
    }
}
