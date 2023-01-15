package com.jtl.helloandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.jtl.helloandroid.databinding.ActivityMainBinding;
import com.jtl.library_network.APIService;
import com.jtl.library_network.ApiObservable;
import com.jtl.library_network.DefaultApiObserver;
import com.jtl.library_network.HttpHelper;
import com.jtl.library_network.OpenAPI;
import com.jtl.library_network.bean.FeedBean;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // getLifecycle().addObserver();
        ActivityMainBinding dataBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        //dataBinding.
        dataBinding.btnMainClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HttpHelper httpHelper = HttpHelper.builder()
                        .setBaseUtl(OpenAPI.baseUrl)
                        .build();

                ApiObservable.defaultMethod(
                        httpHelper.Retrofit()
                                .create(APIService.class)
                                .feed())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribeOn(Schedulers.io())
                        .subscribe(new DefaultApiObserver<FeedBean>() {
                            @Override
                            protected void onSuccess(FeedBean feedBean) {
                                Log.w("jtl",Thread.currentThread().toString());
                                dataBinding.btnMainClick.setText(feedBean.toString());
                            }

                            @Override
                            protected void onFailed(Throwable e) {
                                Log.w("Main",e.toString());
                                dataBinding.btnMainClick.setText(e.toString());
                            }
                        });
            }
        });
    }
}