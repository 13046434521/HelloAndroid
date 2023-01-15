package com.jtl.library_network;

import android.util.Log;

import androidx.annotation.NonNull;

import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class HttpHelper {
    private static final int DEFAULT_TIME_OUT = 60000;
    private String url;
    private Retrofit retrofit;
    private OkHttpClient okHttpClient;

    private static HttpBuilder builder;

    public HttpHelper(String url, Retrofit retrofit, OkHttpClient okHttpClient) {
        this.url = url;
        this.retrofit = retrofit;
        this.okHttpClient = okHttpClient;

        if (okHttpClient == null) {
            this.okHttpClient = new OkHttpClient.Builder()
                    .readTimeout(DEFAULT_TIME_OUT, TimeUnit.SECONDS)
                    .connectTimeout(DEFAULT_TIME_OUT, TimeUnit.SECONDS)
                    .addNetworkInterceptor(new HttpLoggingInterceptor())
                    .addInterceptor(new Interceptor() {
                        @NonNull
                        @Override
                        public Response intercept(@NonNull Chain chain) throws IOException {
                            Request original = chain.request();

                            Request request = original.newBuilder()
                                    .header("token", "")
                                    .header("uk", "Your-App-Name")
                                    .header("channel", "cretin_open_api ")
                                    .header("app", "1.0.0;1;10")
                                    .header("device", "HUAWEI;CDY-AN00 ")
                                    .method(original.method(), original.body())
                                    .build();
                            Log.w("jtl",Thread.currentThread().toString());
                            return chain.proceed(request);
                        }
                    })
                    .build();
        }

        if (retrofit == null) {
            this.retrofit = new Retrofit.Builder()
                    .client(this.okHttpClient)
                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
                    .build();
        }
    }

    public Retrofit Retrofit() {
        return Objects.requireNonNull(retrofit, "it can't be null");
    }

    public OkHttpClient OkHttpClient() {
        return Objects.requireNonNull(okHttpClient, "it can't be null");
    }

    public static HttpBuilder builder() {
        builder = new HttpBuilder();
        return builder;
    }

    public static class HttpBuilder {
        private String url;
        private OkHttpClient client;
        private Retrofit retrofit;

        public HttpBuilder setBaseUtl(String url) {
            this.url = url;
            return this;
        }

        public HttpBuilder setOkHttpClient(OkHttpClient client) {
            this.client = client;
            return this;
        }

        public HttpBuilder setRetrofit(Retrofit retrofit) {
            this.retrofit = retrofit;
            return this;
        }


        public HttpHelper build() {
            return new HttpHelper(url, retrofit, client);
        }
    }
}
