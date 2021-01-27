package com.example.smartplant.ui.Praktik;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.smartplant.R;

public class Praktik3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_praktik3);
    }

    public void next(View view) {
        Intent intent = new Intent(Praktik3.this, Praktik4.class);
        startActivity(intent);
    }

    public void back(View view) {
        Intent intent = new Intent(Praktik3.this, Praktik2.class);
        startActivity(intent);
    }
}
