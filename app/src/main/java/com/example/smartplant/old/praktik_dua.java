package com.example.smartplant.old;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.view.View.OnClickListener;
import androidx.appcompat.app.AppCompatActivity;

import com.example.smartplant.R;


public class praktik_dua extends AppCompatActivity {
    RadioGroup radioGroupNb;
    RadioButton radio1;
    Button Next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_praktik_dua);
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
                Intent intent = new Intent (praktik_dua.this, Praktik_Tiga.class);
                startActivity(intent);

            }
        });
    }

    public void back(View view) {
        Intent intent = new Intent (praktik_dua.this, PraktikSatu.class);
        startActivity(intent);
    }
    public void next(View view) {
        Intent intent = new Intent (praktik_dua.this, Praktik_Tiga.class);
        startActivity(intent);
    }
}
