package com.example.smartplant.ui.Praktik;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.smartplant.R;
import com.example.smartplant.ui.Tentang.tentang;

public class praktik extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_praktik);
    }

    public void btnlogin(View view) {
        Intent intent = new Intent(praktik.this, PraktikLogin.class);
        startActivity(intent);
    }

    public void btnhubungi(View view) {
        Intent intent = new Intent(praktik.this, tentang.class);
        startActivity(intent);
    }
}
