package com.example.smartplant.data.model.daftar;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class DataResult implements Serializable {
    @SerializedName("id_perawatan")
    @Expose
    public String idPerawatan;
    @SerializedName("nama_perawatan")
    @Expose
    public String namaPerawatan;
    @SerializedName("jenis_perawatan")
    @Expose
    public String JenisPerawatan;
    @SerializedName("gambar")
    @Expose
    public String gambar;
    @SerializedName("deskripsi")
    @Expose
    public String deskripsi;

    public String getidPerawatan() {
        return idPerawatan;
    }

    public void setIdPerawatan(String idPerawatan) {
        this.idPerawatan = idPerawatan;
    }

    public String getNamaPerawatan() {
        return namaPerawatan;
    }

    public void setNamaPerawatan(String namaPerawatan) {
        this.namaPerawatan = namaPerawatan;
    }

    public String getjenisPerawatan() {
        return JenisPerawatan;
    }

    public void setjenisPerawatan(String JenisPerawatan) {
        this.JenisPerawatan = JenisPerawatan;
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

