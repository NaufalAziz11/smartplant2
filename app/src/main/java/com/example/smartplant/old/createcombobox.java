package com.example.smartplant.old;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import android.widget.Toast;

import com.example.smartplant.R;

public class createcombobox extends Activity implements AdapterView.OnItemSelectedListener {
    TextView selection;
    String[] lubang = { "10", "50", "100", "200",
            "300", "400", ">500" };
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_penanaman);
        selection = (TextView) findViewById(R.id.pilih);
        Spinner spin = (Spinner) findViewById(R.id.cbbox);
        spin.setOnItemSelectedListener(this);
        ArrayAdapter<String> aa = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, lubang);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(aa);
    }

    public void onItemSelected(AdapterView<?> parent, View v, int position,   long id) {
        Toast.makeText(this, "Anda Memilih: " + lubang[position],Toast.LENGTH_LONG).show();
    }
    public void onNothingSelected(AdapterView<?> parent) {
        Toast.makeText(this, "Jumlah Lubang", Toast.LENGTH_LONG).show();
    }
}

