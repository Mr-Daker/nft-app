package com.example.nft.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.nft.R;

public class Welcome2 extends AppCompatActivity {

    Button ConnectWallet;
    ImageView skipToHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome2);
        ConnectWallet =findViewById(R.id.connectWallet);
        skipToHome=findViewById(R.id.skipToHome);

        ConnectWallet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iNext= new Intent(Welcome2.this, profileSetup.class);
                startActivity(iNext);
            }
        });

        skipToHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home= new Intent(Welcome2.this, com.example.nft.activities.home.class);
                startActivity(home);
            }
        });
    }
}