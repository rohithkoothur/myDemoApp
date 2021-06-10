package com.example.mydemoapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class CricketNews extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cricket_news);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater =getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_cricket:
                Toast.makeText(this,"Currently on Cricket news section",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_Football:
                Intent intent = new Intent(CricketNews.this,FootballNews.class);
                startActivity(intent);
                return true;
            case R.id.action_tennis:
                Intent intent1 = new Intent(CricketNews.this,TennisNews.class);
                startActivity(intent1);
                return true;
            default:
                return super.onOptionsItemSelected(item);


        }

    }

    public void goHome(View view) {
        Intent intent = new Intent(CricketNews.this,MainActivity.class);
        startActivity(intent);
    }
}