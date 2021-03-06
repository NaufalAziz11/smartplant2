package com.example.smartplant.ui.Penanaman;

import com.example.smartplant.data.model.penanaman.ResponsePenanaman;
import com.example.smartplant.data.network.ApiDaftar;
import com.example.smartplant.data.network.ApiEndPointPenanaman;

import io.reactivex.SingleObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class PenanamanPresenter2 implements PenanamanInterface2.Presenter {
    PenanamanInterface2.View view;

    ApiEndPointPenanaman endPointJenisPenanaman;

    public PenanamanPresenter2(PenanamanInterface2.View view) {
        this.view = view;
        endPointJenisPenanaman = ApiDaftar.getUrl().create(ApiEndPointPenanaman.class);
    }

    @Override
    public void getJenisPenanaman() {
        view.onLoadingPenanaman(true);
        endPointJenisPenanaman.getDaftarPenanaman1()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new SingleObserver<ResponsePenanaman>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onSuccess(ResponsePenanaman responsePenanaman) {
                        view.onLoadingPenanaman(false);
                        view.onResultPenanaman(responsePenanaman);
                    }

                    @Override
                    public void onError(Throwable e) {
                        view.onLoadingPenanaman(false);
                        view.onErrorPenanaman();
                        view.showMessage(e.getMessage());
                    }
                });
    }


}
