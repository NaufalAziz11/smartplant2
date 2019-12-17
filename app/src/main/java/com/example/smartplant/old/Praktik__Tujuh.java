package com.example.smartplant.old;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.smartplant.R;

public class Praktik__Tujuh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_praktik___tujuh);
    }
    public void back(View view) {
        Intent intent = new Intent (Praktik__Tujuh.this, Praktik_Enam.class);
        startActivity(intent);
    }

    public void next(View view) {
        Intent intent = new Intent (Praktik__Tujuh.this, Praktik_Delapan.class);
        startActivity(intent);
    }
}
