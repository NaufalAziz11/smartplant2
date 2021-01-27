package com.example.smartplant.data.network;

import com.example.smartplant.data.model.daftar.ResponseDaftar;

import io.reactivex.Single;
import retrofit2.http.GET;

public interface ApiEndPointPerawatan {
    @GET("tampil_perawatanByP.php")
    Single<ResponseDaftar> getDaftarPerawatan();
    @GET("tampil_perawatanByK.php")
    Single<ResponseDaftar> getDaftarPerawatan1();
    @GET("tampil_perawatanByPS.php")
    Single<ResponseDaftar> getDaftarPerawatan2();

}
