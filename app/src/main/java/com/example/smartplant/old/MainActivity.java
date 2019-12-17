package com.example.smartplant.old;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.smartplant.R;

public class MainActivity extends AppCompatActivity {
    public static final String ROOT_URL ="192.168.1.31";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }



    public void Perawatan(View view) {
        Intent intent = new Intent(MainActivity.this,perawatan.class);
        startActivity(intent);
    }

    public void Nutrisi(View view) {
        Intent intent = new Intent(MainActivity.this,nutrisi.class);
        startActivity(intent);
    }

    public void Praktek_Tanam(View view) {
        Intent intent = new Intent(MainActivity.this,praktik.class);
        startActivity(intent);
    }

    public void Katalog(View view) {
        Intent intent = new Intent(MainActivity.this,katalog.class);
        startActivity(intent);
    }


    public void Tentang(View view) {
        Intent intent = new Intent(MainActivity.this,tentang.class);
        startActivity(intent);
    }

    public void btnpenanaman(View view) {
        Intent intent = new Intent(MainActivity.this,penanaman.class);
        startActivity(intent);

    }


}