package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.FileObserver;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editWeight , editHeightFt , editHeightIn;
        TextView txtResult;
        Button btnCalculate;

        editWeight = findViewById(R.id.editWeight);
        editHeightFt = findViewById(R.id.editHeightFt);
        editHeightIn = findViewById(R.id.editHeightIn);
        btnCalculate = findViewById(R.id.btnCalculate);
        txtResult = findViewById(R.id.txtResult);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 int wt =  Integer.parseInt(editWeight.getText().toString());
                 int hft = Integer.parseInt(editHeightFt.getText().toString());
                 int hin = Integer.parseInt(editHeightIn.getText().toString());

                 int totalIn = hft*12+hin;

                 double totalCm = totalIn*2.53;
                 double totalM =totalCm/100;

                 double bmi =wt/(totalM*totalM);

                 if (bmi>25){
                     txtResult.setText("you are OverWeight");
                 } else if (bmi<18) {
                     txtResult.setText("You are UnderWight");
                 } else{
                     txtResult.setText("You are Healthy !!!");
                 }
             }
         });


    }
}