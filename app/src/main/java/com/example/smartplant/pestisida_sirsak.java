package com.example.smartplant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class pestisida_sirsak extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pestisida_sirsak);
    }
    public void back(View view) {
        Intent intent = new Intent(pestisida_sirsak.this,Pestisida_Nabati.class);
        startActivity(intent);
    }
}
