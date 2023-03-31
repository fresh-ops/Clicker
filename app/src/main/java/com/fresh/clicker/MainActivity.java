package com.fresh.clicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String COUNTER_KEY = "COUNTER";
    private TextView counterOut;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counterOut = findViewById(R.id.counterOut);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt(COUNTER_KEY, counter);
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        counter = savedInstanceState.getInt(COUNTER_KEY);
        counterOut.setText(Integer.toString(counter));
    }

    public void increaseCounter(View view) {
        counter++;
        counterOut.setText(Integer.toString(counter));
    }
}