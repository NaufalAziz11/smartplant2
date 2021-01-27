package com.example.smartplant.data.model.penanaman;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class DataResultPenanaman implements Serializable {
    @SerializedName("id_penanaman")
    @Expose
    public String idpenanaman;
    @SerializedName("nama_tanaman")
    @Expose
    public String namatanaman;
    @SerializedName("gambar")
    @Expose
    public String gambar;
    @SerializedName("deskripsi")
    @Expose
    public String deskripsi;

    public String getIdpenanaman() {

        return idpenanaman;
    }

    public void setIdpenanaman(String idpenanaman) {

        this.idpenanaman = idpenanaman;
    }

    public String getNamatanaman() {
        return namatanaman;
    }

    public void setNamatanaman(String namatanaman) {
        this.namatanaman = namatanaman;
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



