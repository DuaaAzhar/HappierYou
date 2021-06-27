package com.example.happieryou;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;

public class Articles extends AppCompatActivity {
    RecyclerView RvList;
    ArticleAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articles);
        RvList=findViewById(R.id.RvList);

        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this);
        RvList.setLayoutManager(layoutManager);
        FirebaseRecyclerOptions<ArticlesClass> options =
                new FirebaseRecyclerOptions.Builder<ArticlesClass>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Articles"), ArticlesClass.class)
                        .build();
        adapter=new ArticleAdapter(options,this);
        RvList.setAdapter(adapter);
        //readAllPost();

    }





    @Override
    protected void onStart() {
        super.onStart();
        adapter.startListening();
    }
    @Override
    protected void onStop() {
        super.onStop();
        adapter.stopListening();
    }


    }
