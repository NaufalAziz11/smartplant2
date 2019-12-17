package com.example.smartplant.old;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

import com.example.smartplant.R;

public class Praktik_Sembilan extends AppCompatActivity {



    RadioGroup radioGroup9;
    RadioButton radioButton1;
    Button Next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_praktik__sembilan);
        radioGroup9 = (RadioGroup) findViewById(R.id.radioGroup9);
        Next = (Button) findViewById(R.id.Next);
        addListenerOnNext();
//        hasil();
    }
    public void back(View view) {
        Intent intent = new Intent (Praktik_Sembilan.this, Praktik_Delapan.class);
        startActivity(intent);
    }


    public void addListenerOnNext(){

        Next.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                int seleksi = radioGroup9.getCheckedRadioButtonId();
                radioButton1 = (RadioButton) findViewById(seleksi);
                Intent intent = new Intent (Praktik_Sembilan.this, Hasil_Praktik.class);
                startActivity(intent);
            }
        });

    }
}
