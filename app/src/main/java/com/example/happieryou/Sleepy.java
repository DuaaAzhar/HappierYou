package com.example.happieryou;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Sleepy extends AppCompatActivity {

    Button btnRain, btnSea, btnForest,btnAnimal;
    private AdView mAdView;
    @SuppressLint("MissingPermission")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sleepy);
        btnRain = findViewById(R.id.buttonRain);
        btnSea = findViewById(R.id.sea_id);
        btnForest = findViewById(R.id.forest_id);
        btnAnimal=findViewById(R.id.animal_id);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        mAdView.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                super.onAdLoaded();
                Toast.makeText(Sleepy.this, "AD load",Toast.LENGTH_SHORT).show();
                // Code to be executed when an ad finishes loading.
            }



            @Override
            public void onAdOpened() {
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
            }

            @Override
            public void onAdClicked() {
                // Code to be executed when the user clicks on an ad.
            }

            @Override
            public void onAdClosed() {
                // Code to be executed when the user is about to return
                // to the app after tapping on an ad.
            }
        });


        YouTubePlayerView youTubePlayerView = findViewById(R.id.activity_main_youtubePlayerView);
        getLifecycle().addObserver(youTubePlayerView);

        youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady( YouTubePlayer youTubePlayer) {
                String videoId = "rRxI0e7YXAE";
                youTubePlayer.loadVideo(videoId, 0);

            }
        });
        btnRain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sleepy.this, RainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btnAnimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sleepy.this, AnimalActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btnSea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady( YouTubePlayer youTubePlayer) {
                        String videoId = "rRxI0e7YXAE";
                        youTubePlayer.loadVideo(videoId, 0);

                    }
                });





            }
        });

        btnForest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                YouTubePlayerView youTubePlayerView = findViewById(R.id.activity_main_youtubePlayerView);
                getLifecycle().addObserver(youTubePlayerView);

                youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady( YouTubePlayer youTubePlayer) {
                        String videoId = "e0rGfjFYrL0&t=1s";
                        youTubePlayer.loadVideo(videoId, 0);

                    }
                });

            }
        });
    }




}