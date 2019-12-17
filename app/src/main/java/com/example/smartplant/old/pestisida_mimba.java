package com.example.smartplant.old;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.smartplant.R;

public class pestisida_mimba extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pestisida_mimba);
    }
    public void back(View view) {
        Intent intent = new Intent(pestisida_mimba.this,Pestisida_Nabati.class);
        startActivity(intent);
    }
}
