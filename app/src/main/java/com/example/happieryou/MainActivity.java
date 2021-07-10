package com.example.happieryou;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
    ImageView ivAnger, ivSad, ivSleep;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        ivAnger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(com.example.happieryou.MainActivity.this, Anger.class);
                startActivity(intent);
            }
        });
        ivSad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(com.example.happieryou.MainActivity.this, Sad.class);
                startActivity(intent);
            }
        });
        ivSleep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(com.example.happieryou.MainActivity.this, Sleepy.class);
                startActivity(intent);
            }
        });


    }
    public void init(){
        ivAnger=findViewById(R.id.ivAnger);
        ivSad=findViewById(R.id.ivSad);
        ivSleep=findViewById(R.id.ivSleep);
    }
}