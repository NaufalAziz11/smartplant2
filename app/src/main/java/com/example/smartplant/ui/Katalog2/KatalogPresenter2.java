package com.example.smartplant.ui.Katalog2;


import com.example.smartplant.data.model.katalog.ResponseKatalog;
import com.example.smartplant.data.network.ApiDaftar;
import com.example.smartplant.data.network.ApiEndPointKatalog;

import io.reactivex.SingleObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class KatalogPresenter2 implements KatalogInterface2.Presenter {
    KatalogInterface2.View view;

    ApiEndPointKatalog endPointJenisKatalog;

    public KatalogPresenter2(KatalogInterface2.View view) {
        this.view = view;
        endPointJenisKatalog = ApiDaftar.getUrl().create(ApiEndPointKatalog.class);
    }

    @Override
    public void getJenisKatalog1() {
        view.onLoadingKatalog(true);
        endPointJenisKatalog.getDaftarKatalog2()
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