package com.example.smartplant.old;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.smartplant.R;

public class Praktik_Enam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_praktik__enam);
    }
    public void back(View view) {
        Intent intent = new Intent (Praktik_Enam.this, Praktik_Lima.class);
        startActivity(intent);
    }

    public void next(View view) {
        Intent intent = new Intent (Praktik_Enam.this, Praktik__Tujuh.class);
        startActivity(intent);
    }
}
