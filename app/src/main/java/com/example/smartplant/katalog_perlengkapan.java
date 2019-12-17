package com.example.smartplant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class katalog_perlengkapan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_katalog_perlengkapan);
    }
    public void back(View view) {
        Intent intent = new Intent(katalog_perlengkapan.this,katalog.class);
        startActivity(intent);
    }
}
