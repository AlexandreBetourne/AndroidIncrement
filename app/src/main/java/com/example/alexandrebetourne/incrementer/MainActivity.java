package com.example.alexandrebetourne.incrementer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int jacki = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void increaseInteger(View view) {
        jacki = jacki + 1;
        display(jacki);
    }

    public void decreaseInteger(View view) {
        jacki = jacki - 1;
        display(jacki);
    }

    private void display(int number) {
        TextView displayInteger = (TextView) findViewById(
                R.id.textView);
        displayInteger.setText("" + number);
    }
}
