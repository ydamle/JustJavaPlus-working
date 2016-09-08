package com.example.android.justjavaplus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int number=0;
    double pricePerUnit=1.25;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void decrement(View view) {
        if(number != 0){
            number--;
            displayQuantity();
        }
    }

    public void increment(View view) {
        number++;
        displayQuantity();
    }

    public void displayQuantity(){


            TextView quantityValueTextView = (TextView) findViewById(R.id.quantityValue);
            quantityValueTextView.setText("" + number);

            TextView totalValueTextView = (TextView) findViewById(R.id.totalValue);
            totalValueTextView.setText("" + number* pricePerUnit);


    }

}
