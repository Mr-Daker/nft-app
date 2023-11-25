package com.example.nft.spalsh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Window;
import android.view.WindowManager;

import com.example.nft.R;
import com.example.nft.activities.Welcome1;
import com.example.nft.shared.SharedPreferences;

public class Loading extends AppCompatActivity {
    int wallet;
    //LottieAnimationView laView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);
        //laView= findViewById(R.id.);


        Intent intent= new Intent(Loading.this, Welcome1.class);


        SharedPreferences sp= new SharedPreferences();

        Window window = getWindow();
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                if(wallet==0){
                    startActivity(intent);
                }
                finish();
            }
        }, 2000);


    }
}