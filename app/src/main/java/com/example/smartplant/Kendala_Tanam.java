package com.example.smartplant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Kendala_Tanam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kendala__tanam);
    }
    public void back(View view) {
        Intent intent = new Intent(Kendala_Tanam.this,perawatan.class);
        startActivity(intent);
    }
    public void lengkap1(View view) {
        Intent intent = new Intent(Kendala_Tanam.this,kendala_layu.class);
        startActivity(intent);
    }
    public void lengkap2(View view) {
        Intent intent = new Intent(Kendala_Tanam.this,kendala_ulat.class);
        startActivity(intent);
    }
}
