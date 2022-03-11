package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

        TextView teksti;
        TextInputLayout tekstiInput;

        //TextView teksti2;
        //TextInputLayout tekstiInput2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Nämä ekalle tekstikentälle.
        teksti = findViewById(R.id.textView);
        tekstiInput = findViewById(R.id.TextInputLayout);

    }


    public void printHelloWorld(View v) {
        System.out.println("Hello World!");
        teksti.setText(tekstiInput.getEditText().getText());
    }
}