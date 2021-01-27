package com.example.smartplant.data.network;

import com.example.smartplant.data.model.penanaman.ResponsePenanaman;

import io.reactivex.Single;
import retrofit2.http.GET;

public interface ApiEndPointPenanaman {
    @GET("tampiltanaman.php")
    Single<ResponsePenanaman> getDaftarPenanaman();
    @GET("tampiltanamanById.php?nama_tanaman=")
    Single<ResponsePenanaman> getDaftarPenanaman1();
}

