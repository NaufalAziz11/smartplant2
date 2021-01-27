package com.example.smartplant.ui.Praktik;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.smartplant.R;

public class Praktik7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_praktik7);
    }

    public void next(View view) {
        Intent intent = new Intent(Praktik7.this, Praktik8.class);
        startActivity(intent);
    }

    public void back(View view) {
        Intent intent = new Intent(Praktik7.this, Praktik6.class);
        startActivity(intent);
    }
}
