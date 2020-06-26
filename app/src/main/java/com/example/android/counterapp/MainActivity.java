package com.example.android.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayNumber(int number){
        TextView showNumber = (TextView) findViewById(R.id.numberCounter);
        showNumber.setText(String.format("%04d", number));
    }

    public void countNumber (View view){
        counter += 1;
        displayNumber(counter);
    }

    public void resetNumber (View view){
        counter = 0;
        displayNumber(counter);
    }
}