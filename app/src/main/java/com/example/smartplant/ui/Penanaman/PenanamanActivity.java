package com.example.smartplant.ui.Penanaman;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
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

public class PenanamanActivity extends AppCompatActivity implements PenanamanInterface.View  {
    Unbinder unbinder1;
    PenanamanAdapter adapter;
    List<DataResultPenanaman> data = new ArrayList<>();
    //RecyclerView recycleViewer;


    PenanamanPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penanaman);
        unbinder1 = ButterKnife.bind(this);

        rvPenanaman =findViewById(R.id.rvPenanaman);
        rvPenanaman.addItemDecoration(new DividerItemDecoration(PenanamanActivity.this,LinearLayoutManager.HORIZONTAL));
        adapter = new PenanamanAdapter(this, data);
        LinearLayoutManager horizontalLayoutManager = new LinearLayoutManager(PenanamanActivity.this, LinearLayoutManager.HORIZONTAL, false);
        rvPenanaman.setLayoutManager(horizontalLayoutManager);
        //recycleViewer.setAdapter(adapter);
        //rvPenanaman.setLayoutManager(new LinearLayoutManager(this));
        rvPenanaman.setAdapter(adapter);

        presenter = new PenanamanPresenter(this);

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