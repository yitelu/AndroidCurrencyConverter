package com.ytl.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convertToDollars(View view) {
        EditText ntdAmount = findViewById(R.id.ntdEditText);
        String myNTD = ntdAmount.getText().toString();
        double myRealNTD = Double.parseDouble(myNTD);
        double ConvertedDollars = myRealNTD / 31.5;
        double myNum = Math.round(ConvertedDollars * 100) / 100.00;

        Toast.makeText(this, "Your $NTD "+myRealNTD+" equals US Dolloar$ "+myNum, Toast.LENGTH_LONG).show();
    }
}
