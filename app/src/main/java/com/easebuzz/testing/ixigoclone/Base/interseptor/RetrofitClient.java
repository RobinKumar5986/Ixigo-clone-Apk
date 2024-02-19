package com.easebuzz.testing.ixigoclone.Base.interseptor;

import com.easebuzz.testing.ixigoclone.Base.managers.ApiUriManager;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class RetrofitClient {
    public static Retrofit retrofit=new Retrofit.Builder()
            .baseUrl(ApiUriManager.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();
    public static Retrofit getRetrofit() {
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(loggingInterceptor)
                .build();
        retrofit=new Retrofit.Builder()
                .baseUrl(ApiUriManager.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();
        return retrofit;
    }

    public static void setRetrofit(Retrofit retrofit) {

        RetrofitClient.retrofit = retrofit;
    }
}
