package com.example.smartplant.ui.Perawatan2;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.example.smartplant.R;
import com.example.smartplant.data.model.daftar.DataResult;
import com.example.smartplant.data.model.daftar.ResponseDaftar;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class PerawatanActivity2 extends AppCompatActivity implements PerawatanInterface2.View {
    Unbinder unbinder1;
    PerawatanAdapter2 adapter;
    List<DataResult> data = new ArrayList<>();
    PerawatanPresenter2 presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perawatan);
        unbinder1 = ButterKnife.bind(this);
        adapter = new PerawatanAdapter2(this, data);
        rvPerawatan.setLayoutManager(new LinearLayoutManager(this));
        rvPerawatan.setAdapter(adapter);

       presenter = new PerawatanPresenter2(this);

        presenter.getJenisPerawatan2();
    }
    @Override
    public void onLoadingPerawatan(boolean loading) {
        if(loading){
            srLoading2.setRefreshing(true);
        }else{
            srLoading2.setRefreshing(false);
        }
    }
    @Override
    public void onResultPerawatan(ResponseDaftar response) {
        data.clear();
        data.addAll(response.getResult());
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onErrorPerawatan() {
        Toast.makeText(this, "Gagal memuat data", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showMessage(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @BindView(R.id.srLoading2)
    SwipeRefreshLayout srLoading2;
    @BindView(R.id.rvPerawatan)
    RecyclerView rvPerawatan;


}

