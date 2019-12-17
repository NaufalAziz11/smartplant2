package com.example.smartplant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class katalog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_katalog);
    }
    public void back1(View view) {
        Intent intent = new Intent(katalog.this,MainActivity.class);
        startActivity(intent);
    }
    public void perlengkapan(View view) {
        Intent intent = new Intent(katalog.this,katalog_perlengkapan.class);
        startActivity(intent);
    }
    public void tanaman(View view) {
        Intent intent = new Intent(katalog.this,katalog_tanaman.class);
        startActivity(intent);
    }
    public void hama(View view) {
        Intent intent = new Intent(katalog.this,katalog_hama.class);
        startActivity(intent);
    }


}
