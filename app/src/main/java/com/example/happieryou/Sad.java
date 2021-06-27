package com.example.happieryou;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Sad extends AppCompatActivity {
ImageView ivArticles, ivEx_Sad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sad);
        init();
        ivArticles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(com.example.happieryou.Sad.this, Articles.class);
                startActivity(intent);
            }
        });
        ivEx_Sad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(com.example.happieryou.Sad.this, Exercise_Sad.class);
                startActivity(intent);
            }
        });

    }
    public void init(){
        ivArticles=findViewById(R.id.ivArticles);
        ivEx_Sad=findViewById(R.id.ivEx_Sad);
    }
}