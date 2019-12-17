package com.example.smartplant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class selada extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selada);
    }

    public void back(View view) {
        Intent intent = new Intent(selada.this,penanaman.class);
        startActivity(intent);
    }
}
