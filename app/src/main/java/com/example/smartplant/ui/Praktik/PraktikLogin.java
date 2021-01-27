package com.example.smartplant.ui.Praktik;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.smartplant.R;

public class PraktikLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_praktik_login);
    }

    public void btnlogin(View view) {
        Intent intent = new Intent(PraktikLogin.this, Praktik1.class);
        startActivity(intent);
    }


}
