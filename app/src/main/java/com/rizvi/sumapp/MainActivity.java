package com.rizvi.sumapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText,editText2;
    Button button;
    RadioButton radioButton,radioButton2,radioButton3,radioButton4;
    RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editText = findViewById(R.id.editText);
        final EditText editText2 = findViewById(R.id.editText2);
        Button button = findViewById(R.id.button);
        RadioGroup rg = findViewById(R.id.rg);
        final RadioButton radioButton = findViewById(R.id.radioButton);
        final RadioButton radioButton2 = findViewById(R.id.radioButton2);
        final RadioButton radioButton3 = findViewById(R.id.radioButton3);
        final RadioButton radioButton4 = findViewById(R.id.radioButton4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (radioButton.isChecked()) {
                   Double a= Double.parseDouble(editText.getText().toString()) ;
                   Double b= Double.parseDouble(editText2.getText().toString()) ;
                    double sum = a + b;
                    Toast.makeText(MainActivity.this,"Addition is "+sum,Toast.LENGTH_SHORT).show();
                }
                else if (radioButton2.isChecked()) {
                   Double a= Double.parseDouble(editText.getText().toString()) ;
                   Double b= Double.parseDouble(editText2.getText().toString()) ;
                   double sub = a - b;
                    Toast.makeText(MainActivity.this,"Subtraction is "+sub,Toast.LENGTH_SHORT).show();
                }
                else if (radioButton3.isChecked()) {
                   Double a= Double.parseDouble(editText.getText().toString()) ;
                   Double b= Double.parseDouble(editText2.getText().toString()) ;
                  double  mul = a * b;
                    Toast.makeText(MainActivity.this,"Multiplication is "+mul,Toast.LENGTH_SHORT).show();
                }
                else if(radioButton4.isChecked()) {
                   Double a= Double.parseDouble(editText.getText().toString()) ;
                   Double b= Double.parseDouble(editText2.getText().toString()) ;
                   double div = a / b;
                   Toast.makeText(MainActivity.this,"Division is "+div,Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

}