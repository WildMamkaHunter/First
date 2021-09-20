package com.example.stivan;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.concurrent.TimeUnit;

public class LogoActivity extends AppCompatActivity
{
    ImageView imageView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logo_activity);
        imageView= findViewById(R.id.imageView);

        Animation animation = AnimationUtils.loadAnimation(LogoActivity.this, R.anim.alpha);
        imageView.startAnimation(animation);

        Thread thread = new Thread(){
            public void run(){
                try{
                    TimeUnit.SECONDS.sleep(3);
                    Intent intent = new Intent(LogoActivity.this, MainActivity.class);
                    startActivity(intent);
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        };
        thread.start();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
