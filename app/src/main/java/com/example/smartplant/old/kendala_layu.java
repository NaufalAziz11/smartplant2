package com.example.smartplant.old;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.smartplant.R;

public class kendala_layu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kendala_layu);
    }
    public void back(View view) {
        Intent intent = new Intent(kendala_layu.this,Kendala_Tanam.class);
        startActivity(intent);
    }
}
