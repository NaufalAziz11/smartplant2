package com.example.smartplant.old;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.smartplant.R;

public class perawatan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perawatan);
    }

    public void back1(View view) {
        Intent intent = new Intent(perawatan.this,MainActivity.class);
        startActivity(intent);
    }

    public void PemNutrisi(View view) {
        Intent intent = new Intent(perawatan.this,Pemberian_Nutrisi.class);
        startActivity(intent);
    }
    public void PesNab(View view) {
        Intent intent = new Intent(perawatan.this,Pestisida_Nabati.class);
        startActivity(intent);
    }
    public void KenTanam(View view) {
        Intent intent = new Intent(perawatan.this,Kendala_Tanam.class);
        startActivity(intent);
    }

}
