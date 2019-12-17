package com.example.smartplant.old;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.smartplant.R;

public class Hasil_Praktik extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil__praktik);
    }
    public void back(View view) {
        Intent intent = new Intent (Hasil_Praktik.this, Praktik_Sembilan.class);
        startActivity(intent);
    }

    public void menu(View view) {
        Intent intent = new Intent (Hasil_Praktik.this, MainActivity.class);
        startActivity(intent);
    }

}
