package com.example.smartplant.ui.Nutrisi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.smartplant.R;


public class nutrisi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrisi);
    }

    public void lengkap1(View view) {
        Intent intent = new Intent(nutrisi.this, Nutrisi1.class);
        startActivity(intent);
    }

    public void lengkap2(View view) {
        Intent intent = new Intent(nutrisi.this, Nutrisi2.class);
        startActivity(intent);
    }
}
