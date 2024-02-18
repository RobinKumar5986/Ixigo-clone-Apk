package com.easebuzz.testing.ixigoclone.Base.utils;
import com.easebuzz.testing.ixigoclone.Base.interfaces.ApiServices;
import com.easebuzz.testing.ixigoclone.Base.interfaces.ResponseListener;
import com.easebuzz.testing.ixigoclone.Base.interseptor.RetrofitClient;
import com.easebuzz.testing.ixigoclone.Base.managers.ApiManager;
import com.easebuzz.testing.ixigoclone.Base.models.Response.Posts;

import java.util.List;

import retrofit2.Call;

public class ApiCallingMethods {
    public static void getAllPost(ResponseListener listener, Integer requestCode){
        Call<List<Posts>> call = RetrofitClient.getRetrofit().create(ApiServices.class).getPosts();
        ApiManager.getData(listener,call,requestCode);
    }
}
