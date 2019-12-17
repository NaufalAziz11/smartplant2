package com.example.smartplant.old;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.smartplant.R;

public class Pestisida_Nabati extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pestisida__nabati);
    }
    public void back(View view) {
        Intent intent = new Intent(Pestisida_Nabati.this,perawatan.class);
        startActivity(intent);
    }
    public void lengkap1(View view) {
        Intent intent = new Intent(Pestisida_Nabati.this,pestisida_mimba.class);
        startActivity(intent);
    }
    public void lengkap2(View view) {
        Intent intent = new Intent(Pestisida_Nabati.this,pestisida_sirsak.class);
        startActivity(intent);
    }
}
