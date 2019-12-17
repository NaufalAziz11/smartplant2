package com.example.smartplant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;


public class penanaman extends AppCompatActivity {

    Spinner spinner;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penanaman);
        spinner = (Spinner) findViewById(R.id.cbbox);
        button = (Button) findViewById(R.id.pilih);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(penanaman.this, "Selected" +
                        spinner.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();

            }
        });

    }


    public void back(View view) {
        Intent intent = new Intent(penanaman.this,MainActivity.class);
        startActivity(intent);
    }

    public void pakcoy(View view) {
        Intent intent = new Intent(penanaman.this,pakcoy.class);
        startActivity(intent);
    }

    public void btnselada(View view) {
        Intent intent = new Intent(penanaman.this,selada.class);
        startActivity(intent);
    }
}
