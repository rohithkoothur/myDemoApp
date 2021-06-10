package com.example.mydemoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mRegisterNow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRegisterNow = findViewById(R.id.register);
    }

    public void registerNow(View view) {
        Intent intent =new Intent(MainActivity.this,Register.class);
        startActivity(intent);



    }

    public void cricketReadmore(View view) {
        Intent intent =new Intent(MainActivity.this,CricketNews.class);
        startActivity(intent);

    }

    public void FootballReadmore(View view) {
        Intent intent =new Intent(MainActivity.this,FootballNews.class);
        startActivity(intent);
    }

    public void TennisReadmore(View view) {
        Intent intent =new Intent(MainActivity.this,TennisNews.class);
        startActivity(intent);
    }
}