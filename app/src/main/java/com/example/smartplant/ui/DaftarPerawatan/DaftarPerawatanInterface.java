package com.example.smartplant.ui.DaftarPerawatan;

import com.example.smartplant.data.model.daftar.ResponseDaftar;

public interface DaftarPerawatanInterface {
    interface View{
        void onLoadingDaftarPerawatan(boolean loading);
        void onResultDaftarPerawatan(ResponseDaftar response);
        void onErrorDaftarPerawatan();

        void showMessage(String msg);
    }
    interface Presenter{
        void getDaftarPerawatan();
    }
}
