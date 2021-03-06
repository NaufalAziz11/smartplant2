package com.example.smartplant.ui.Katalog;


import com.example.smartplant.data.model.katalog.ResponseKatalog;
import com.example.smartplant.data.network.ApiDaftar;
import com.example.smartplant.data.network.ApiEndPointKatalog;

import io.reactivex.SingleObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class KatalogPresenter implements KatalogInterface.Presenter {
    KatalogInterface.View view;

    ApiEndPointKatalog endPointJenisKatalog;

    public KatalogPresenter(KatalogInterface.View view) {
        this.view = view;
        endPointJenisKatalog = ApiDaftar.getUrl().create(ApiEndPointKatalog.class);
    }

    @Override
    public void getJenisKatalog1() {
        view.onLoadingKatalog(true);
        endPointJenisKatalog.getDaftarKatalog1()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new SingleObserver<ResponseKatalog>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onSuccess(ResponseKatalog responseKatalog) {
                        view.onLoadingKatalog(false);
                        view.onResultKatalog(responseKatalog);
                    }

                    @Override
                    public void onError(Throwable e) {
                        view.onLoadingKatalog(false);
                        view.onErrorKatalog();
                        view.showMessage(e.getMessage());
                    }
                });

    }
}