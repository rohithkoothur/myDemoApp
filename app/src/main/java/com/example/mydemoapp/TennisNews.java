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

public class TennisNews extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tennis_news);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_cricket:
                Intent intent = new Intent(TennisNews.this, CricketNews.class);
                startActivity(intent);
                return true;
            case R.id.action_Football:
                Intent intent1 = new Intent(TennisNews.this, FootballNews.class);
                startActivity(intent1);
                return true;
            case R.id.action_tennis:
                Toast.makeText(this, "Currently Tennis News Selected", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);


        }

    }

    public void goHome(View view) {
        Intent intent = new Intent(TennisNews.this, MainActivity.class);
        startActivity(intent);
    }
}