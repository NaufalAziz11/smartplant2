package com.example.smartplant.old;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.smartplant.R;

public class praktik extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_praktik);
    }

    public void back2(View view) {
        Intent intent = new Intent(praktik.this,MainActivity.class);
        startActivity(intent);
    }

    public void btnhubungi(View view) {
        Intent intent = new Intent(praktik.this,tentang.class);
        startActivity(intent);
    }

    public void btnlogin(View view) {
        Intent intent = new Intent(praktik.this,Login_Activity.class);
        startActivity(intent);
    }
}
