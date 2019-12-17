package com.example.smartplant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class katalog_hama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_katalog_hama);
    }
    public void back(View view) {
        Intent intent = new Intent(katalog_hama.this,katalog.class);
        startActivity(intent);
    }
}
