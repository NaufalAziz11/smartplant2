package com.example.smartplant.ui.Perawatan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.smartplant.R;
import com.example.smartplant.ui.Perawatan2.PerawatanActivity2;
import com.example.smartplant.ui.Perawatan3.PerawatanActivity3;

public class jenis_perawatan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jenis_perawatan);

    }

    public void back1(View view) {

    }

    public void PemNutrisi(View View ) {
        Intent intent = new Intent(jenis_perawatan.this, PerawatanActivity.class);
        startActivity(intent);

    }


    public void KenTanam(View view) {
        Intent intent = new Intent(jenis_perawatan.this, PerawatanActivity2.class);
        startActivity(intent);

    }

    public void PesNab(View view) {
        Intent intent = new Intent(jenis_perawatan.this, PerawatanActivity3.class);
        startActivity(intent);
    }

    public void Perlengkapan(View view) {
    }
}
