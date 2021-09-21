package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //EditText myTextField1 = (EditText) findViewById(R.id.myTextField1);
    //EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);

    public void addButtonClicked(View view) {
        EditText myTextField1 = (EditText) findViewById(R.id.myTextField1);
        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        int addInt = Integer.parseInt(myTextField1.getText().toString()) + Integer.parseInt(myTextField2.getText().toString());
        goToActivity2(addInt);
    }

    public void subtractButtonClicked(View view) {
        EditText myTextField1 = (EditText) findViewById(R.id.myTextField1);
        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        int subtractInt = Integer.parseInt(myTextField1.getText().toString()) - Integer.parseInt(myTextField2.getText().toString());
        goToActivity2(subtractInt);
    }

    public void multiplyButtonClicked(View view) {
        EditText myTextField1 = (EditText) findViewById(R.id.myTextField1);
        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        int multiplyInt = Integer.parseInt(myTextField1.getText().toString()) * Integer.parseInt(myTextField2.getText().toString());
        goToActivity2(multiplyInt);
    }

    public void divideButtonClicked(View view) {
        EditText myTextField1 = (EditText) findViewById(R.id.myTextField1);
        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        int divideInt = Integer.parseInt(myTextField1.getText().toString()) / Integer.parseInt(myTextField2.getText().toString());
        goToActivity2(divideInt);
    }

    public void goToActivity2(int num) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("intVariableName", num);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}