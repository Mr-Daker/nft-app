package com.example.nft;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button Next;
    ImageView imageView;
    ImageView circle1,circle2,circle3;
    TextView textView;
    int flag=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Next=findViewById(R.id.nextWelcome);
        imageView=findViewById(R.id.welcomeImage);
        textView=findViewById(R.id.introText1);
        circle1=findViewById(R.id.circle1);
        circle2=findViewById(R.id.circle2);
        circle3=findViewById(R.id.circle3);

            Next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(flag==0){
                        imageView.setImageResource(R.drawable.initial_img2);
                        textView.setText("Start your own NFT gallery now");
                        circle1.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(MainActivity.this, R.color.black)));
                        circle2.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(MainActivity.this, R.color.white)));
                        //circle3.setColorFilter(getResources().getColor(R.color.circle3Color));
                        flag=1;
                    }
                    else if (flag==1) {
                        imageView.setImageResource(R.drawable.initial_img3);
                        textView.setText("Discovering the world of Crypto App");
                        circle2.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(MainActivity.this, R.color.black)));
                        circle3.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(MainActivity.this, R.color.white)));
                        flag=2;
                    }
                    else if(flag==2){
                        Intent iNext= new Intent(MainActivity.this, Welcome2.class);
                        startActivity(iNext);
                    }
                }
            });
        }



}