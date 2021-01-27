package com.example.smartplant.ui.DaftarPerawatan;

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

public class DaftarPerawatanActivity  extends AppCompatActivity implements DaftarPerawatanInterface.View {
    Unbinder unbinder1;
    DaftarPerawatanAdapter adapter;
    List<DataResult> data = new ArrayList<>();

    DaftarPerawatanPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_perawatan);
        unbinder1 = ButterKnife.bind(this);
        adapter = new DaftarPerawatanAdapter(this, data);
        rvDaftarPerawatan.setLayoutManager(new LinearLayoutManager(this));
        rvDaftarPerawatan.setAdapter(adapter);

        presenter = new DaftarPerawatanPresenter(this);

        presenter.getDaftarPerawatan();
    }
    @Override
    public void onLoadingDaftarPerawatan(boolean loading) {
        if(loading){
            srLoading1.setRefreshing(true);
        }else{
            srLoading1.setRefreshing(false);
        }
    }

    @Override
    public void onResultDaftarPerawatan(ResponseDaftar response) {
        data.clear();
        data.addAll(response.getResult());
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onErrorDaftarPerawatan() {
        Toast.makeText(this, "Gagal memuat data", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showMessage(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @BindView(R.id.srLoading1)
    SwipeRefreshLayout srLoading1;
    @BindView(R.id.rvDaftarPerawatan)
    RecyclerView rvDaftarPerawatan;

}

