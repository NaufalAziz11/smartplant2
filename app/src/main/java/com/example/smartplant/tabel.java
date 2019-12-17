package com.example.smartplant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tabel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabel);
    }
    public void back(View view) {
        Intent intent = new Intent(tabel.this,nutrisi.class);
        startActivity(intent);
    }
}
