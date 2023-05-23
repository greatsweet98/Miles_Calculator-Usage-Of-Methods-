package com.example.miles_calculatorusageofmethods;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.miles_calculatorusageofmethods.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Add(View v){
        EditText et1 = (EditText)findViewById(R.id.editTextNumber);
        EditText et2 = (EditText)findViewById(R.id.editTextNumber2);
        EditText et3 = (EditText)findViewById(R.id.editTextNumber3);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1+n2;

        et3.setText("Sum :" + result);

    }
    public void Subtract(View v) {
        EditText et1 = (EditText) findViewById(R.id.edittextnumber);
        EditText et2 = (EditText) findViewById(R.id.edittextnumber2);
        EditText et3 = (EditText) findViewById(R.id.edittextnumber3);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1-n2;

        et3.setText("Difference :" + result);
    }
    public void Multiply(View v) {
        EditText et1 = (EditText) findViewById(R.id.edittextnumber);
        EditText et2 = (EditText) findViewById(R.id.edittextnumber2);
        EditText et3 = (EditText) findViewById(R.id.edittextnumber3);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1*n2;

        et3.setText("Product :" + result);
    }
    public void Divide(View v) {
        EditText et1 = (EditText) findViewById(R.id.edittextnumber);
        EditText et2 = (EditText) findViewById(R.id.edittextnumber2);
        EditText et3 = (EditText) findViewById(R.id.edittextnumber3);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1/n2;

        et3.setText("Difference :" + result);
    }
}