package com.example.smartplant.old;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.smartplant.R;
import com.example.smartplant.old.konfig.konfigurasi_pakcoy;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class pakcoy extends AppCompatActivity {

    RecyclerView nRecycler;

    private ImageView imageViewgambar;
    private TextView textViewdetail;
    private TextView textViewnama;
    private TextView textViewbiaya;
    private TextView textViewsinopsis;
    private TextView textViewselengkapnya;
    private String id;
    private String JSON_STRING;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pakcoy);
        //nRecycler = (RecyclerView) findViewById(R.id.)
        Intent intent = getIntent();
        id = intent.getStringExtra(konfigurasi_pakcoy.EMP_ID);

        //editTextID = (EditText) findViewById(R.id.editTextID);
        textViewnama = (TextView) findViewById(R.id.textViewnama);
        textViewbiaya = (TextView) findViewById(R.id.textViewbiaya);
        textViewdetail = (TextView) findViewById(R.id.textViewdetail);
        imageViewgambar = (ImageView) findViewById(R.id.imageViewgambar);
        textViewsinopsis = (TextView) findViewById(R.id.textViewsinopsis);
        textViewselengkapnya = (TextView) findViewById(R.id.textViewselengkapnya);



        //listView = (ListView) findViewById(R.id.listView);
        //listView.setOnItemClickListener(this);
        //getJSON();
        enabledetail();
        getpakcoy();

    }

    private  void enabledetail(){
        textViewdetail.setVisibility(View.INVISIBLE);
    }
    public void lengkap(View view) {
        textViewdetail.setVisibility(View.VISIBLE);
        textViewsinopsis.setVisibility(View.INVISIBLE);
        textViewselengkapnya.setVisibility(View.INVISIBLE);
    }
    public void kurang(View view) {
        textViewdetail.setVisibility(View.INVISIBLE);
        textViewsinopsis.setVisibility(View.VISIBLE);
        textViewselengkapnya.setVisibility(View.VISIBLE);
    }

    private void getpakcoy(){
        class Getpakcoy extends AsyncTask<Void,Void,String> {
            ProgressDialog loading;
            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(pakcoy.this,"Fetching...","Wait...",false,false);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
                showEmployee(s);
            }

            @Override
            protected String doInBackground(Void... params) {
                RequestHandler rh = new RequestHandler();
                String s = rh.sendGetRequest(konfigurasi_pakcoy.URL_GET_ALL);
                return s;

            }
        }
        Getpakcoy ge = new Getpakcoy();
        ge.execute();
    }



    private void showEmployee(String json) {
        try {
            JSONObject jsonObject = new JSONObject(json);
            JSONArray result = jsonObject.getJSONArray(konfigurasi_pakcoy.TAG_JSON_ARRAY);
            JSONObject jo = result.getJSONObject(0);

            //String id = jo.getString(konfigurasi.TAG_ID);
            String nama = jo.getString(konfigurasi_pakcoy.TAG_NAMA_TANAMAN);
            String gambar = jo.getString(konfigurasi_pakcoy.TAG_GAMBAR);
            String deskripsi = jo.getString(konfigurasi_pakcoy.TAG_DESKRIPSI);
            String biaya = jo.getString(konfigurasi_pakcoy.TAG_ID_BIAYA);
            String sinopsis = jo.getString(konfigurasi_pakcoy.TAG_DESKRIPSI);

            //editTextID.setText(id);

            textViewnama.setText(nama);
            textViewsinopsis.setText(sinopsis);

            //imageViewgambar.setImageResource(R.mipmap.pakcoy_foreground);
            textViewbiaya.setText(biaya);
            textViewdetail.setText(deskripsi);

            Glide.with(getApplicationContext())
                    .load("http://192.168.137.141/Android/smartplant/img/" +("lettuce"))
                    .crossFade()
                    .placeholder(R.mipmap.ic_launcher)
                    .into(imageViewgambar);



        } catch (JSONException e) {
            e.printStackTrace();
        }
    }



}
