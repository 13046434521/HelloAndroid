package com.jtl.library_network;

import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.observers.DefaultObserver;
import io.reactivex.rxjava3.schedulers.Schedulers;

/**
 * Author（作者）：jtl
 * Date（日期）：2023/1/11 20:06
 * Detail（详情）：Observable 的一个封装类
 */
public class ApiObservable {
    public static <T> Observable<T> defaultMethod(Observable<T> observable){
        return observable
                .subscribeOn(AndroidSchedulers.mainThread())
                .observeOn(Schedulers.io())
                .timeout(5 * 1000, TimeUnit.SECONDS)
                .retry(3);
    }
}
