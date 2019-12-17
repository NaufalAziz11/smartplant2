package com.example.smartplant;


import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.smartplant.konfig.konfigurasi;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class tentang extends AppCompatActivity {
    //private EditText editTextID;
   private TextView textViewHead;
    private TextView textViewdesc;
      private TextView textView1;
      private TextView textViewh1;
      private TextView textViewh2;
      private TextView textViewNomor;

  private String id;
   private String JSON_STRING;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang);
       Intent intent = getIntent();

        id = intent.getStringExtra(konfigurasi.EMP_ID);

        //editTextID = (EditText) findViewById(R.id.editTextID);
        textViewHead = (TextView) findViewById(R.id.textViewHead);
        textViewh1 = (TextView) findViewById(R.id.textViewh1);
        textViewh2 = (TextView) findViewById(R.id.textViewh2);
        textViewdesc = (TextView) findViewById(R.id.textViewdesc);
        textViewNomor = (TextView) findViewById(R.id.textViewNomor);
        textView1 = (TextView) findViewById(R.id.textView1);
        //listView = (ListView) findViewById(R.id.listView);
        //listView.setOnItemClickListener(this);
        //getJSON();

       gettentang();
    }

    private void gettentang(){
        class GetTentang extends AsyncTask<Void,Void,String>{
            ProgressDialog loading;
            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(tentang.this,"Fetching...","Wait...",false,false);
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
                String s = rh.sendGetRequest(konfigurasi.URL_GET_ALL);
                return s;

            }
        }
        GetTentang ge = new GetTentang();
        ge.execute();
    }



    private void showEmployee(String json) {
        try {
            JSONObject jsonObject = new JSONObject(json);
            JSONArray result = jsonObject.getJSONArray(konfigurasi.TAG_JSON_ARRAY);
            JSONObject jo = result.getJSONObject(0);

            //String id = jo.getString(konfigurasi.TAG_ID);
           String judul = jo.getString(konfigurasi.TAG_JUDUL);
            String head = jo.getString(konfigurasi.TAG_HEAD);
             String deskripsi = jo.getString(konfigurasi.TAG_DESKRIPSI);
            String head2 = jo.getString(konfigurasi.TAG_HEAD2);
            String head3 = jo.getString(konfigurasi.TAG_HEAD3);
            String nomor = jo.getString(konfigurasi.TAG_NOMOR);

            //editTextID.setText(id);
           textView1.setText(judul);
            textViewHead.setText(head);
            textViewh1.setText(head2);
            textViewh2.setText(head3);
            textViewdesc.setText(deskripsi);
            textViewNomor.setText(nomor);



        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
