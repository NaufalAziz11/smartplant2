package com.example.smartplant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class takaran_abmix extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_takaran_abmix);
    }
    public void back(View view) {
        Intent intent = new Intent(takaran_abmix.this, meracik_abmix.class);
        startActivity(intent);
    }
}
