package com.example.smartplant.ui.Perawatan;

import com.example.smartplant.data.model.daftar.ResponseDaftar;
import com.example.smartplant.data.network.ApiDaftar;
import com.example.smartplant.data.network.ApiEndPointPerawatan;

import io.reactivex.SingleObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class PerawatanPresenter implements PerawatanInterface.Presenter {
    PerawatanInterface.View view;

    ApiEndPointPerawatan endPointJenisPerawatan;

    public PerawatanPresenter(PerawatanInterface.View view) {
        this.view = view;
        endPointJenisPerawatan = ApiDaftar.getUrl().create(ApiEndPointPerawatan.class);
    }

    @Override
    public void getJenisPerawatan() {
        view.onLoadingPerawatan(true);
        endPointJenisPerawatan.getDaftarPerawatan()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new SingleObserver<ResponseDaftar>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onSuccess(ResponseDaftar responseDaftar) {
                        view.onLoadingPerawatan(false);
                        view.onResultPerawatan(responseDaftar);
                    }

                    @Override
                    public void onError(Throwable e) {
                        view.onLoadingPerawatan(false);
                        view.onErrorPerawatan();
                        view.showMessage(e.getMessage());
                    }
                });
    }


}
