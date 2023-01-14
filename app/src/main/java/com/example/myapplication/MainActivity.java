package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
LinearLayout fon;
TextView nadpis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nadpis = findViewById(R.id.text);
        fon = findViewById(R.id.fon);
    }

    public  void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.redbut:
                nadpis.setText(R.string.red);
                fon.setBackgroundColor(ContextCompat.getColor(this,R.color.redCol));
                break;
            case R.id.yellowbut:
                nadpis.setText(R.string.yellow);
                fon.setBackgroundColor(ContextCompat.getColor(this,R.color.yellowCol));
                break;
            case R.id.greenbut:
                nadpis.setText(R.string.green);
                fon.setBackgroundColor(ContextCompat.getColor(this,R.color.greenCol));
                break;
        }
    }
}