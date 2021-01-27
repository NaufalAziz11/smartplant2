package com.example.smartplant.ui.Katalog;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.example.smartplant.R;
import com.example.smartplant.data.model.katalog.DataResultKatalog;
import com.example.smartplant.data.model.katalog.ResponseKatalog;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class KatalogActivity  extends AppCompatActivity implements KatalogInterface.View{
    Unbinder unbinder1;
    KatalogAdapter adapter;
    List<DataResultKatalog> data = new ArrayList<>();


    KatalogPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_katalog1);

        unbinder1 = ButterKnife.bind(this);
        adapter = new KatalogAdapter(this, data);
        rvKatalog.setLayoutManager(new LinearLayoutManager(this));
        rvKatalog.setAdapter(adapter);

        presenter = new KatalogPresenter(this);

        presenter.getJenisKatalog1();
    }
    @Override
    public void onLoadingKatalog(boolean loading) {
        if(loading){
            srLoading2.setRefreshing(true);
        }else{
            srLoading2.setRefreshing(false);
        }
    }

    @Override
    public void onResultKatalog(ResponseKatalog response) {
        data.clear();
        data.addAll(response.getResultKatalog());
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onErrorKatalog() {
        Toast.makeText(this, "Gagal memuat data", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showMessage(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @BindView(R.id.srLoading2)
    SwipeRefreshLayout srLoading2;
    @BindView(R.id.rvKatalog)
    RecyclerView rvKatalog;


}
