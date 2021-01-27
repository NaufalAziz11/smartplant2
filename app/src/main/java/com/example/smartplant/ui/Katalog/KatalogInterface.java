package com.example.smartplant.ui.Katalog;


import com.example.smartplant.data.model.katalog.ResponseKatalog;

public interface KatalogInterface {
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
