package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView textView2 = (TextView) findViewById(R.id.textView2);
        Intent intent = getIntent();
        int intValue = intent.getIntExtra("intVariableName", 0);
        textView2.setText(String.valueOf(intValue));
    }
}