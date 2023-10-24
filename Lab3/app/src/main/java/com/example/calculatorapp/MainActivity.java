package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private enum Operator {none, add, minus, multiply, divide}
    private double data1 = 0;
    private Operator optr = Operator.none;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btn00Click (View view){
        EditText eText = findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"0");
    }
    public void btn01Click (View view){
        EditText eText = findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"1");
    }
    public void btn02Click (View view){
        EditText eText = findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"2");
    }
    public void btn03Click (View view){
        EditText eText = findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"3");
    }
    public void btn04Click (View view){
        EditText eText = findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"4");
    }
    public void btn05Click (View view){
        EditText eText = findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"5");
    }
    public void btn06Click (View view){
        EditText eText = findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"6");
    }
    public void btn07Click (View view){
        EditText eText = findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"7");
    }
    public void btn08Click (View view){
        EditText eText = findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"8");
    }
    public void btn09Click (View view){
        EditText eText = findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"9");
    }
    public void buttonAddClick (View view){
        optr = Operator.add;
        EditText eText = findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }
    public void buttonMinClick (View view){
        optr = Operator.minus;
        EditText eText = findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }
    public void buttonMultiClick (View view){
        optr = Operator.multiply;
        EditText eText = findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }
    public void buttonDivideClick (View view){
        optr = Operator.divide;
        EditText eText = findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }
    public void buttonDecimalClick (View view){
        EditText eText = findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+".");
    }
    public void buttonEQClick(View view){
        if (optr != Operator.none){
            EditText eText = findViewById(R.id.resultEdit);
            double data2 = Double.parseDouble(eText.getText().toString());
            double result = 0;
            if (optr == Operator.add){
                result = data1+data2;
            } else if(optr == Operator.minus){
                result = data1-data2;
            } else if (optr == Operator.multiply) {
                result = data1*data2;
            } else if (optr == Operator.divide) {
                result = data1/data2;
            }
            optr = Operator.none;
            data1 = result;
            if((result - (int)result) != 0){
                eText.setText(String.valueOf(result));
            } else {
                eText.setText(String.valueOf((int)result));
            }

        }
    }
}
