package com.example.smartplant.ui.Penanaman;

import com.example.smartplant.data.model.penanaman.ResponsePenanaman;

public interface PenanamanInterface2 {
    interface View {
        void onLoadingPenanaman(boolean loading);

        void onResultPenanaman(ResponsePenanaman response);

        void onErrorPenanaman();

        void showMessage(String msg);
    }

    interface Presenter {
        void getJenisPenanaman();


    }
}