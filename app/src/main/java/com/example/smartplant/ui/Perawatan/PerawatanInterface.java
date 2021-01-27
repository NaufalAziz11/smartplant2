package com.example.smartplant.ui.Perawatan;

import com.example.smartplant.data.model.daftar.ResponseDaftar;

public interface PerawatanInterface {
    interface View {
        void onLoadingPerawatan(boolean loading);

        void onResultPerawatan(ResponseDaftar response);

        void onErrorPerawatan();

        void showMessage(String msg);
    }

    interface Presenter {
        void getJenisPerawatan();


    }
}