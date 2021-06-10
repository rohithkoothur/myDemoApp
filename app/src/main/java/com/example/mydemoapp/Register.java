package com.example.mydemoapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.zip.Inflater;

public class Register extends AppCompatActivity {


    private EditText mNamePerson;
    public TextView mDOB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mDOB =findViewById(R.id.dob_label);






        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

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
                Intent intent = new Intent(Register.this,CricketNews.class);
                startActivity(intent);
                return true;
            case R.id.action_Football:
                Intent intent1 = new Intent(Register.this,FootballNews.class);
                startActivity(intent1);
                return true;
            case R.id.action_tennis:
                Intent intent2 = new Intent(Register.this,TennisNews.class);
                startActivity(intent2);
                return true;
            default:
                return super.onOptionsItemSelected(item);


        }

    }


    public void registered(View view) {
        AlertDialog.Builder myAlertDialog = new AlertDialog.Builder(Register.this);
        myAlertDialog.setTitle("Register?");
        myAlertDialog.setMessage("Click Confrim to complete Registration");
        myAlertDialog.setPositiveButton("Confirm", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Registered",Toast.LENGTH_SHORT).show();
            }
        });
        myAlertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Registration failed", Toast.LENGTH_SHORT).show();
            }
        });
        myAlertDialog.show();




    }

    public void goHome(View view) {
        Intent intent = new Intent(Register.this,MainActivity.class);
        startActivity(intent);
    }

    public void selectDOB(View view) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(),"datePicker");

    }

    public void processDatePickerResult(int year,int month,int day){
        String month_string = Integer.toString(month+1);
        String day_string = Integer.toString(day);
        String year_String = Integer.toString(year);
        Calendar c = Calendar.getInstance();
        String dobString = DateFormat.getDateInstance().format(c.getTime());
        TextView dobTextView = findViewById(R.id.dob_label);
        String dateMessage = (month_string + "/" + day_string + "/" + year_String);
        Toast.makeText(this,"Date: "+ dateMessage,Toast.LENGTH_SHORT).show();
        dobTextView.setText(dateMessage);


    }


}