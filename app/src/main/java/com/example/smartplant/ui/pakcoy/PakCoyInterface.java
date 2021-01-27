
        package com.example.smartplant.ui.pakcoy;

        import com.example.smartplant.data.model.pakcoy.ResponsePakCoy;

public interface PakCoyInterface {
    interface View{
        void onLoadingPakCoy(boolean loading);
        void onResultPakCoy(ResponsePakCoy response);
        void onErrorPakCoy();

        void showMessage(String msg);
    }
    interface Presenter{
        void getPakCoy();
    }
}