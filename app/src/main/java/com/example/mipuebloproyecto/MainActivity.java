package com.example.mipuebloproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    MediaPlayer cancion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cancion=MediaPlayer.create(this,R.raw.audioinicio);
        cancion.start();

        TimerTask inicioAPP=new TimerTask() {
            @Override
            public void run() {

            }
        };
        Timer tiempo=new Timer();
        tiempo.schedule(inicioAPP,7000);
    }
}