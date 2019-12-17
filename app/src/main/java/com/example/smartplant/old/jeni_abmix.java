package com.example.smartplant.old;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.smartplant.R;

public class jeni_abmix extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jeni_abmix);
    }
    public void back(View view) {
        Intent intent = new Intent(jeni_abmix.this,Pemberian_Nutrisi.class);
        startActivity(intent);
    }
}
