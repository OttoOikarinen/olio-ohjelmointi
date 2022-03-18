package com.example.bottledispenser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    TextView teksti;
    String palautus = null;
    private static boolean loop = true;
    BottleDispenser bD = BottleDispenser.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teksti = findViewById(R.id.textView);
    }

    public void addMoney(View v) {
        palautus = bD.addMoney();
        teksti.setText(palautus);
    }

    public void buyBottle(View v) {
        palautus = bD.buyBottle();
        teksti.setText(palautus);
    }

    public void returnMoney(View v) {
        palautus = bD.returnMoney();
        teksti.setText(palautus);
    }
}

