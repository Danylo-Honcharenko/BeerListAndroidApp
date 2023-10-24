package com.example.studyandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button findBeer = findViewById(R.id.button);
        Beer beer = new Beer(findViewById(R.id.beer_result), findViewById(R.id.spinner));

        findBeer.setOnClickListener(beer::find);
    }
}