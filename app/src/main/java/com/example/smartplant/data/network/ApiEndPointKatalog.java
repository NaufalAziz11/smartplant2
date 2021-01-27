package com.example.smartplant.data.network;

import com.example.smartplant.data.model.katalog.ResponseKatalog;

import io.reactivex.Single;
import retrofit2.http.GET;

public interface ApiEndPointKatalog {
    @GET("tampil_katalogP.php")
    Single<ResponseKatalog> getDaftarKatalog1();
    @GET("tampil_katalogT.php")
    Single<ResponseKatalog> getDaftarKatalog2();
    @GET("tampil_katalogH.php")
    Single<ResponseKatalog> getDaftarKatalog3();
}
