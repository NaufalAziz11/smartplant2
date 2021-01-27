package com.example.smartplant.ui.Perawatan2;

import com.example.smartplant.data.model.daftar.ResponseDaftar;

public interface PerawatanInterface2 {
    interface View {
        void onLoadingPerawatan(boolean loading);

        void onResultPerawatan(ResponseDaftar response);

        void onErrorPerawatan();

        void showMessage(String msg);
    }

    interface Presenter {
        void getJenisPerawatan2();
    }

}
