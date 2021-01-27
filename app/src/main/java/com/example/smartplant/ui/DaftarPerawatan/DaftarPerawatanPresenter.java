package com.example.smartplant.ui.DaftarPerawatan;

import com.example.smartplant.data.model.daftar.ResponseDaftar;
import com.example.smartplant.data.network.ApiDaftar;
import com.example.smartplant.data.network.ApiEndPointPerawatan;

import io.reactivex.SingleObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class DaftarPerawatanPresenter implements DaftarPerawatanInterface.Presenter {
    DaftarPerawatanInterface.View view;
    ApiEndPointPerawatan endPointPerawatan;

    public DaftarPerawatanPresenter(DaftarPerawatanInterface.View view) {
        this.view = view;
        endPointPerawatan = ApiDaftar.getUrl().create(ApiEndPointPerawatan.class);
    }

    @Override
    public void getDaftarPerawatan() {
        view.onLoadingDaftarPerawatan(true);
        endPointPerawatan.getDaftarPerawatan()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new SingleObserver<ResponseDaftar>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onSuccess(ResponseDaftar responseDaftar) {
                        view.onLoadingDaftarPerawatan(false);
                        view.onResultDaftarPerawatan(responseDaftar);
                    }

                    @Override
                    public void onError(Throwable e) {
                        view.onLoadingDaftarPerawatan(false);
                        view.onErrorDaftarPerawatan();
                        view.showMessage(e.getMessage());
                    }
                });
    }


}
