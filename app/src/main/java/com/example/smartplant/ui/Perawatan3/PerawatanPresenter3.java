package com.example.smartplant.ui.Perawatan3;

import com.example.smartplant.data.model.daftar.ResponseDaftar;
import com.example.smartplant.data.network.ApiDaftar;
import com.example.smartplant.data.network.ApiEndPointPerawatan;

import io.reactivex.SingleObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;


public class PerawatanPresenter3 implements PerawatanInterface3.Presenter{
    PerawatanInterface3.View view;
    ApiEndPointPerawatan endPointJenisPerawatan;

    public PerawatanPresenter3(PerawatanInterface3.View view) {
        this.view = view;
        endPointJenisPerawatan = ApiDaftar.getUrl().create(ApiEndPointPerawatan.class);
}
    @Override
    public void getJenisPerawatan3() {
        view.onLoadingPerawatan(true);
        endPointJenisPerawatan.getDaftarPerawatan2()
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
