package com.example.smartplant.old;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.smartplant.R;

public class Pemberian_Nutrisi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pemberian__nutrisi);
    }
    public void back(View view) {
        Intent intent = new Intent(Pemberian_Nutrisi.this,perawatan.class);
        startActivity(intent);
    }
    public void lengkap2(View view) {
        Intent intent = new Intent(Pemberian_Nutrisi.this,jeni_abmix.class);
        startActivity(intent);
    }
    public void lengkap1(View view) {
        Intent intent = new Intent(Pemberian_Nutrisi.this,pemberian_abmix.class);
        startActivity(intent);
    }
}
