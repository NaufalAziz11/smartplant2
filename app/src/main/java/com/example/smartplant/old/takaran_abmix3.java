package com.example.smartplant.old;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.smartplant.R;

public class takaran_abmix3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_takaran_abmix3);
    }
    public void back(View view) {
        Intent intent = new Intent(takaran_abmix3.this, meracik_abmix.class);
        startActivity(intent);
    }
}