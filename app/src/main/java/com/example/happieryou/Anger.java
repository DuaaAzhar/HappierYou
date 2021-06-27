package com.example.happieryou;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Anger extends AppCompatActivity {
    ImageView ivYoga,ivDuaa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anger);
        init();
        ivYoga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(com.example.happieryou.Anger.this, YogaAnger.class);
                startActivity(intent);
            }
        });
        ivDuaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(com.example.happieryou.Anger.this, DuaasAnger.class);
                startActivity(intent);
            }
        });
    }
    public void init(){
        ivYoga=findViewById(R.id.ivYoga);
        ivDuaa=findViewById(R.id.ivDuaa);
    }
}