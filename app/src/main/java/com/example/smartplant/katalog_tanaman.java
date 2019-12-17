package com.example.smartplant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class katalog_tanaman extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_katalog_tanaman);
    }
    public void back(View view) {
        Intent intent = new Intent(katalog_tanaman.this,katalog.class);
        startActivity(intent);
    }
}
