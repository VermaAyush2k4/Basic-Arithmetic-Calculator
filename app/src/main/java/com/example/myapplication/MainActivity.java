package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
    TextView ans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText) findViewById(R.id.editTextTextPersonName);
        et2=(EditText) findViewById(R.id.editTextTextPersonName2);
        ans=(TextView) findViewById((R.id.textView4));
    }
    public void calculator(View v){
        double i = Double.parseDouble(et1.getText().toString());
        double j = Double.parseDouble(et2.getText().toString());
        double k = i+j;
        ans.setText("Ans is : " +k);
    }
    public void calculator2(View v){
        double i = Double.parseDouble(et1.getText().toString());
        double j = Double.parseDouble(et2.getText().toString());
        double k = i-j;
        ans.setText("Ans is : " +k);
    }
    public void calculator3(View v){
        double i = Double.parseDouble(et1.getText().toString());
        double j = Double.parseDouble(et2.getText().toString());
        double k = i*j;
        ans.setText("Ans is : " +k);
    }
    public void calculator4(View v){
        double i = Double.parseDouble(et1.getText().toString());
        double j = Double.parseDouble(et2.getText().toString());
        double k = (double) i/j;
        ans.setText("Ans is : " +k);
    }
}