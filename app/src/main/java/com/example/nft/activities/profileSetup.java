package com.example.nft.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.nft.R;

public class profileSetup extends AppCompatActivity {

    Button camera,upload,submit;
    ImageView backButton;
    EditText name,email,bio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        camera=findViewById(R.id.Camera);
        upload=findViewById(R.id.Upload);
        submit=findViewById(R.id.setupSubmit);
        backButton=findViewById(R.id.backButton);
        name=findViewById(R.id.Username);
        email=findViewById(R.id.Email);
        bio=findViewById(R.id.Bio);

        backButton.setOnClickListener(view -> onBackPressed());

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(profileSetup.this, walletId.class);
                startActivity(intent);
            }
        });


    }
}