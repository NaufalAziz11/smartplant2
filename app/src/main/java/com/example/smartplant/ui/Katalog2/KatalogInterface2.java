package com.example.smartplant.ui.Katalog2;


import com.example.smartplant.data.model.katalog.ResponseKatalog;

public interface KatalogInterface2 {
    interface View {
        void onLoadingKatalog(boolean loading);

        void onResultKatalog(ResponseKatalog response);

        void onErrorKatalog();

        void showMessage(String msg);
    }

    interface Presenter {
        void getJenisKatalog1();

    }
}
