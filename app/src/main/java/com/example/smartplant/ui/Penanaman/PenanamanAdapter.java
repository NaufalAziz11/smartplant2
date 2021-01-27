package com.example.smartplant.ui.Penanaman;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.smartplant.BuildConfig;
import com.example.smartplant.R;
import com.example.smartplant.data.model.penanaman.DataResultPenanaman;
import com.example.smartplant.utils.ImageHelper;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PenanamanAdapter extends RecyclerView.Adapter<PenanamanAdapter.ViewHolder> {
    Context context;
    List<DataResultPenanaman> data;

    public PenanamanAdapter(Context context, List<DataResultPenanaman> data) {
        this.context = context;
        this.data = data;

    }

    @NonNull
    @Override
    public PenanamanAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_penanaman,
                parent, false);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull PenanamanAdapter.ViewHolder holder, int position) {
        holder.tvName.setText(data.get(position).getNamatanaman());
        String gambar = BuildConfig.BASE_URL+"img/"+data.get(position).getGambar();
        Log.e("Gambar", "Gambar URL : "+gambar);
        ImageHelper.getImage(holder.ivPhoto, gambar);
        holder.tvName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,PenanamanActivity3.class);
                context.startActivity(intent);

                String tvName = data.get(position).getNamatanaman().toString();
                Toast.makeText(context,tvName +"is selected", Toast.LENGTH_SHORT).show();

            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.tvName)
        TextView tvName;
        @BindView(R.id.ivPhoto)
        ImageView ivPhoto;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}