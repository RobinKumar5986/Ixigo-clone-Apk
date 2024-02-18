package com.easebuzz.testing.ixigoclone.Base.interseptor;

import com.easebuzz.testing.ixigoclone.Base.managers.ApiUriManager;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    public static Retrofit retrofit=new Retrofit.Builder()
            .baseUrl(ApiUriManager.BASE_TEST_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();
    public static Retrofit getRetrofit() {
        return retrofit;
    }

    public static void setRetrofit(Retrofit retrofit) {
        RetrofitClient.retrofit = retrofit;
    }
}
