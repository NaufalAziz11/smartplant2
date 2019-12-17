package com.example.smartplant.data.network;

import com.example.smartplant.data.model.pakcoy.ResponsePakCoy;

import io.reactivex.Single;
import retrofit2.http.GET;

public interface ApiEndPoint {
    @GET("tampilpakcoy.php")
    Single<ResponsePakCoy> getPakcoy();
}
