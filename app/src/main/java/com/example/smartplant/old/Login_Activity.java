package com.example.smartplant.old;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.smartplant.R;

public class Login_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_);
    }

    public void back3(View view) {
        Intent intent = new Intent(Login_Activity.this,praktik.class);
        startActivity(intent);
    }

    public void btnlogin(View view) {
        Intent intent = new Intent(Login_Activity.this,PraktikSatu.class);
        startActivity(intent);
    }
}
