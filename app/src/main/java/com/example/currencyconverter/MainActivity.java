package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convertButtonFunc (View view){

        EditText currencyToConvertInput = findViewById(R.id.numberInput);

        double dollarAmount = Double.parseDouble(currencyToConvertInput.getText().toString());

        double conversionRate = 0.78;

        double poundAmount = dollarAmount*conversionRate;

        Toast.makeText(this,  "£" + String.format(Locale.US, "%.2f", poundAmount) , Toast.LENGTH_LONG).show();

    }

}