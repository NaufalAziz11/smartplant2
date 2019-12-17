package com.example.smartplant.old;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.smartplant.R;

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
