
        package com.example.smartplant.ui.pakcoy;

        import android.content.Context;
        import android.util.Log;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ImageView;
        import android.widget.TextView;

        import androidx.annotation.NonNull;
        import androidx.recyclerview.widget.RecyclerView;

        import com.example.smartplant.BuildConfig;
        import com.example.smartplant.R;
        import com.example.smartplant.data.model.pakcoy.DataResult;
        import com.example.smartplant.utils.ImageHelper;

        import org.sufficientlysecure.htmltextview.HtmlHttpImageGetter;
        import org.sufficientlysecure.htmltextview.HtmlTextView;

        import java.util.List;

        import butterknife.BindView;
        import butterknife.ButterKnife;

public class PakCoyAdapter extends RecyclerView.Adapter<PakCoyAdapter.ViewHolder> {

    Context context;
    List<DataResult> data;

    public PakCoyAdapter(Context context, List<DataResult> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_pakcoy,
                parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tvName.setText(data.get(position).getNamaTanaman());
        holder.tvDeskripsi.setHtml(data.get(position).getDeskripsi(), new HtmlHttpImageGetter(holder.tvDeskripsi));
        String gambar = BuildConfig.BASE_URL+"img/"+data.get(position).getGambar();
        Log.e("Gambar", "Gambar URL : "+gambar);
        ImageHelper.getImage(holder.ivPhoto, gambar);
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
        @BindView(R.id.tvDeskripsi)
        HtmlTextView tvDeskripsi;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}