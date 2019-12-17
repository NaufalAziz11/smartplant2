package com.example.smartplant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class pemberian_abmix extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pemberian_abmix);
    }
    public void back(View view) {
        Intent intent = new Intent(pemberian_abmix.this,Pemberian_Nutrisi.class);
        startActivity(intent);
    }
}
