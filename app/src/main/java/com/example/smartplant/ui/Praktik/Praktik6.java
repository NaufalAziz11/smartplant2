package com.example.smartplant.ui.Praktik;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.smartplant.R;

public class Praktik6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_praktik6);
    }

    public void next(View view) {
        Intent intent = new Intent(Praktik6.this, Praktik7.class);
        startActivity(intent);
    }

    public void back(View view) {
        Intent intent = new Intent(Praktik6.this, Praktik5.class);
        startActivity(intent);
    }
}
