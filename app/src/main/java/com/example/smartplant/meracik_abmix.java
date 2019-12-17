package com.example.smartplant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class meracik_abmix extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meracik_abmix);
    }

    public void back(View view) {
        Intent intent = new Intent(meracik_abmix.this, nutrisi.class);
        startActivity(intent);
    }
    public void detil(View view) {
        Intent intent = new Intent(meracik_abmix.this, takaran_abmix.class);
        startActivity(intent);
    }
    public void detil3(View view) {
        Intent intent = new Intent(meracik_abmix.this, takaran_abmix2.class);
        startActivity(intent);
    }
    public void detil2(View view) {
        Intent intent = new Intent(meracik_abmix.this, takaran_abmix3.class);
        startActivity(intent);
    }

    }
