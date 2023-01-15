package com.jtl.library_network;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.observers.DefaultObserver;

/**
 * Author（作者）：jtl
 * Date（日期）：2023/1/11 20:17
 * Detail（详情）：默认观察者回调
 */
public abstract class DefaultApiObserver<T> extends DefaultObserver<T> {
    @Override
    public void onNext(@NonNull T t) {
        onSuccess(t);
    }

    @Override
    public void onError(@NonNull Throwable e) {
        onFailed(e);
    }

    @Override
    public void onComplete() {

    }

    protected abstract void onSuccess(@NonNull T t);

    protected abstract void onFailed(@NonNull Throwable e);
}
