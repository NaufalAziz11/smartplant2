package com.example.smartplant.data.model.katalog;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class DataResultKatalog implements Serializable {
    @SerializedName("id_katalog")
    @Expose
    public String idkatalog;
    @SerializedName("nama")
    @Expose
    public String namakatalog;
    @SerializedName("gambar")
    @Expose
    public String gambar;
    @SerializedName("deskripsi")
    @Expose
    public String deskripsi;


    public String getIdkatalog() {
        return idkatalog;
    }

    public void setIdkatalog(String idJenis) {
        this.idkatalog = idkatalog;
    }

    public String getNamakatalog() {
        return namakatalog;
    }

    public void setNamakatalog(String namakatalog) {
        this.namakatalog = namakatalog;
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



