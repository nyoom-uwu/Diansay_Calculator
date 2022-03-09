package com.example.diansay_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    double var1, var2;
    TextView Blank;
    EditText Inp1, Inp2;
    Button add, sub, mul, div, mod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Inp1 = findViewById(R.id.editTextNumberFirstVariable);
        Inp2 = findViewById(R.id.editTextNumberSecondVariable);
        Blank = findViewById(R.id.Blank);
        add = findViewById(R.id.button_addition);
        sub = findViewById(R.id.button_subtraction);
        mul = findViewById(R.id.button_multiplication);
        div = findViewById(R.id.button_division);
        mod = findViewById(R.id.button_modulo);

        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);
        mod.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        var1 = Double.parseDouble(Inp1.getText().toString());
        var2 = Double.parseDouble(Inp2.getText().toString());
        switch (view.getId()) {
            case (R.id.button_addition):
                total(var1,var2,Blank);
                break;
            case (R.id.button_subtraction):
                minus(var1,var2,Blank);
                break;
            case (R.id.button_multiplication):
                multi(var1,var2,Blank);
                break;
            case (R.id.button_division):
                divi(var1,var2,Blank);
                break;
            case (R.id.button_modulo):
                modu(var1,var2,Blank);
                break;
        }
    }

    private void total(double var1, double var2, TextView blank) {
        blank.setText(String.valueOf(var1+var2));
    }

    private void minus(double var1, double var2, TextView blank) {
        blank.setText(String.valueOf(var1-var2));
    }

    private void multi(double var1, double var2, TextView blank) {
        blank.setText(String.valueOf(var1*var2));
    }

    private void divi(double var1, double var2, TextView blank) {
        blank.setText(String.valueOf(var1/var2));
    }

    private void modu(double var1, double var2, TextView blank) {
        blank.setText(String.valueOf(var1%var2));
    }

}