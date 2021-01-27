package com.example.smartplant.ui.Katalog;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.smartplant.R;
import com.example.smartplant.ui.Katalog2.KatalogActivity2;
import com.example.smartplant.ui.Katalog3.KatalogActivity3;

public class katalog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jenis_katalog);
    }

    public void Perlengkapan(View view) {
        Intent intent = new Intent(katalog.this, KatalogActivity.class);
        startActivity(intent);
    }

    public void Tanaman(View view) {
        Intent intent = new Intent(katalog.this, KatalogActivity2.class);
        startActivity(intent);
    }

    public void Hama(View view) {
        Intent intent = new Intent(katalog.this, KatalogActivity3.class);
        startActivity(intent);
    }
}
