package com.example.bookappdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ImageView imageView = findViewById(R.id.SplashScreenImage);
//        ImageView imageView2 = findViewById(R.id.SplashScreenImage2);
//
//        Animation animationUtils = AnimationUtils.loadAnimation(this, R.anim.side_slide_example);
//        Animation animationUtils2 = AnimationUtils.loadAnimation(this, R.anim.side_slide_example_2);
//
//        imageView.startAnimation(animationUtils);
//        imageView2.startAnimation(animationUtils2);

        TextView textView1 = findViewById(R.id.textView1);
        TextView textView2 = findViewById(R.id.textView2);
//
        Animation animationUtils = AnimationUtils.loadAnimation(this, R.anim.side_slide_example);
        Animation animationUtils2 = AnimationUtils.loadAnimation(this, R.anim.side_slide_example_2);

        textView1.startAnimation(animationUtils);
        textView2.startAnimation(animationUtils2);

        changeActivity();
    }

    private void changeActivity() {
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                startActivity(new Intent(MainActivity.this, LandingIndex.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        };
        Timer timer = new Timer();
        timer.schedule(task, 5000);
    }
}


