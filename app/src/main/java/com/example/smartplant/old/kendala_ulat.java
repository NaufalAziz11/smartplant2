package com.example.smartplant.old;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.smartplant.R;

public class kendala_ulat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kendala_ulat);
    }
    public void back(View view) {
        Intent intent = new Intent(kendala_ulat.this,Kendala_Tanam.class);
        startActivity(intent);
    }
}
