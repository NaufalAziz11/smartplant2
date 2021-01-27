package com.example.smartplant.ui.Penanaman;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.example.smartplant.R;
import com.example.smartplant.data.model.penanaman.DataResultPenanaman;
import com.example.smartplant.data.model.penanaman.ResponsePenanaman;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class PenanamanActivity3 extends AppCompatActivity implements PenanamanInterface2.View  {
    Unbinder unbinder1;
    PenanamanAdapter2 adapter;
    List<DataResultPenanaman> data = new ArrayList<>();

    PenanamanPresenter2 presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penanaman3);
        unbinder1 = ButterKnife.bind(this);
        adapter = new PenanamanAdapter2(this, data);
        rvPenanaman.setLayoutManager(new LinearLayoutManager(this));
        rvPenanaman.setAdapter(adapter);

        presenter = new PenanamanPresenter2(this);

        presenter.getJenisPenanaman();
    }
    @Override
    public void onLoadingPenanaman(boolean loading) {
        if(loading){
            srLoading2.setRefreshing(true);
        }else{
            srLoading2.setRefreshing(false);
        }
    }

    @Override
    public void onResultPenanaman(ResponsePenanaman response) {
        data.clear();
        data.addAll(response.getResultPenanaman());
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onErrorPenanaman() {
        Toast.makeText(this, "Gagal memuat data", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showMessage(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @BindView(R.id.srLoading2)
    SwipeRefreshLayout srLoading2;
    @BindView(R.id.rvPenanaman)
    RecyclerView rvPenanaman;


}
