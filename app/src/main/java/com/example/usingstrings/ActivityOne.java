package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityOne extends AppCompatActivity {
    TextView textView1;
    TextView textView2;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        textView2= findViewById(R.id.textView2);
        textView2.setText(R.string.Msg2);
    }
}