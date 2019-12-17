package com.example.smartplant.ui.pakcoy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.smartplant.R;
import com.example.smartplant.data.model.pakcoy.DataResult;
import com.example.smartplant.data.model.pakcoy.ResponsePakCoy;

import org.sufficientlysecure.htmltextview.HtmlTextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class PakCoyActivity extends AppCompatActivity implements PakCoyInterface.View {

    Unbinder unbinder;
    PakCoyAdapter adapter;
    List<DataResult> data = new ArrayList<>();

    PakCoyPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pak_coy);

        unbinder = ButterKnife.bind(this);
        adapter = new PakCoyAdapter(this, data);
        rvPakCoy.setLayoutManager(new LinearLayoutManager(this));
        rvPakCoy.setAdapter(adapter);

        presenter = new PakCoyPresenter(this);

        presenter.getPakCoy();
    }

    @Override
    public void onLoadingPakCoy(boolean loading) {
        if(loading){
            srLoading.setRefreshing(true);
        }else{
            srLoading.setRefreshing(false);
        }
    }

    @Override
    public void onResultPakCoy(ResponsePakCoy response) {
        data.clear();
        data.addAll(response.getResult());
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onErrorPakCoy() {
        Toast.makeText(this, "Gagal memuat data", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showMessage(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @BindView(R.id.srLoading)
    SwipeRefreshLayout srLoading;
    @BindView(R.id.rvPakCoy)
    RecyclerView rvPakCoy;

}
