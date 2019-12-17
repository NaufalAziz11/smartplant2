package com.example.smartplant;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;


public class PraktikSatu extends AppCompatActivity {

    RadioGroup radioGroupNb;
    RadioButton radio1;
    Button Next;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_praktik_satu);
        radioGroupNb = (RadioGroup) findViewById(R.id.radioGroupNb);
        Next = (Button) findViewById(R.id.Next);
        addListenerOnNext();
    }
    public void addListenerOnNext() {
        Next.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                int seleksi = radioGroupNb.getCheckedRadioButtonId();
                radio1 = (RadioButton) findViewById(seleksi);

                Intent intent = new Intent (PraktikSatu.this, praktik_dua.class);
                startActivity(intent);

            }
        });
    }

    public void menu(View view) {
        Intent intent = new Intent (PraktikSatu.this, MainActivity.class);
        startActivity(intent);
    }

    public void back(View view) {

    }
}