package com.example.smartplant.old;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.smartplant.R;

public class Praktik_Empat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_praktik__empat);
    }

    public void back(View view) {
        Intent intent = new Intent (Praktik_Empat.this, Praktik_Tiga.class);
        startActivity(intent);
    }

    public void next(View view) {
        Intent intent = new Intent (Praktik_Empat.this, Praktik_Lima.class);
        startActivity(intent);
    }
}
