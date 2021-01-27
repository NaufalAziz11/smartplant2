package com.example.smartplant.ui.beranda;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.smartplant.R;
import com.example.smartplant.ui.Katalog.katalog;
import com.example.smartplant.ui.Nutrisi.nutrisi;
import com.example.smartplant.ui.Penanaman.PenanamanActivity;
import com.example.smartplant.ui.Perawatan.jenis_perawatan;
import com.example.smartplant.ui.Praktik.praktik;
import com.example.smartplant.ui.Tentang.tentang;

public class Beranda extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);

        //button



    }

    public void Perawatan(View view) {
        Intent intent = new Intent(Beranda.this, jenis_perawatan.class);
        startActivity(intent);
    }

    public void Nutrisi(View view) {
        Intent intent = new Intent(Beranda.this,nutrisi.class);
        startActivity(intent);
    }

    public void Praktek_Tanam(View view) {
        Intent intent = new Intent(Beranda.this,praktik.class);
        startActivity(intent);
    }

    public void Katalog(View view) {
        Intent intent = new Intent(Beranda.this, katalog.class);
        startActivity(intent);
    }


    public void Tentang(View view) {
        Intent intent = new Intent(Beranda.this,tentang.class);
        startActivity(intent);
    }

    public void btnpenanaman(View view) {
        Intent intent = new Intent(Beranda.this, PenanamanActivity.class);
        startActivity(intent);

    }


}