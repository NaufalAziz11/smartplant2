
        package com.example.smartplant.data.model.pakcoy;

        import com.google.gson.annotations.Expose;
        import com.google.gson.annotations.SerializedName;

        import java.io.Serializable;

public class DataResult implements Serializable {
    @SerializedName("id_penanaman")
    @Expose
    public String idPenanaman;
    @SerializedName("nama_tanaman")
    @Expose
    public String namaTanaman;
    @SerializedName("gambar")
    @Expose
    public String gambar;
    @SerializedName("deskripsi")
    @Expose
    public String deskripsi;

    public String getIdPenanaman() {
        return idPenanaman;
    }

    public void setIdPenanaman(String idPenanaman) {
        this.idPenanaman = idPenanaman;
    }

    public String getNamaTanaman() {
        return namaTanaman;
    }

    public void setNamaTanaman(String namaTanaman) {
        this.namaTanaman = namaTanaman;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
}