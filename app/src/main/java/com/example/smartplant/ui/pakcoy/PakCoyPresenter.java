package com.example.smartplant.ui.pakcoy;

import com.example.smartplant.data.model.pakcoy.ResponsePakCoy;
import com.example.smartplant.data.network.Api;
import com.example.smartplant.data.network.ApiEndPoint;

import io.reactivex.SingleObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class PakCoyPresenter implements PakCoyInterface.Presenter {

    PakCoyInterface.View view;
    ApiEndPoint endPoint;

    public PakCoyPresenter(PakCoyInterface.View view) {
        this.view = view;
        endPoint = Api.getUrl().create(ApiEndPoint.class);
    }

    @Override
    public void getPakCoy() {
        view.onLoadingPakCoy(true);
        endPoint.getPakcoy()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new SingleObserver<ResponsePakCoy>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onSuccess(ResponsePakCoy responsePakCoy) {
                        view.onLoadingPakCoy(false);
                        view.onResultPakCoy(responsePakCoy);
                    }

                    @Override
                    public void onError(Throwable e) {
                        view.onLoadingPakCoy(false);
                        view.onErrorPakCoy();
                        view.showMessage(e.getMessage());
                    }
                });
    }
}
