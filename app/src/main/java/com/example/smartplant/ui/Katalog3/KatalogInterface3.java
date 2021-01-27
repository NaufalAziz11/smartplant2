package com.example.smartplant.ui.Katalog3;


import com.example.smartplant.data.model.katalog.ResponseKatalog;

public interface KatalogInterface3 {
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
