package com.easebuzz.testing.ixigoclone.Base.utils;
import com.easebuzz.testing.ixigoclone.Base.interfaces.ApiServices;
import com.easebuzz.testing.ixigoclone.Base.interfaces.ResponseListener;
import com.easebuzz.testing.ixigoclone.Base.interseptor.RetrofitClient;
import com.easebuzz.testing.ixigoclone.Base.managers.ApiManager;
import com.easebuzz.testing.ixigoclone.Base.models.Response.Comments;
import com.easebuzz.testing.ixigoclone.Base.models.Response.Posts;
import com.easebuzz.testing.ixigoclone.Base.models.Response.TrainInfo;

import java.util.List;

import retrofit2.Call;

public class ApiCallingMethods extends ApiManager {
    public static void getPnrStatus(ResponseListener listener, String pnr,Integer requestCode){
        Call<TrainInfo> call=RetrofitClient.getRetrofit().create(ApiServices.class).getPnrStatus(pnr);
        getRailwayData(listener,call,requestCode);
    }
    public static void getAllPost(ResponseListener listener, Integer requestCode){
        Call<List<Posts>> call = RetrofitClient.getRetrofit().create(ApiServices.class).getPosts();
        getData(listener,call,requestCode);
    }
    public static void getComments(ResponseListener listener,Integer requestCode,String id){
        Call<List<Comments>> call= RetrofitClient.getRetrofit().create(ApiServices.class).getComments(id);
        getData(listener,call,requestCode);
    }
    public static void getCommentsWithId(ResponseListener listener,Integer requestCode,String id){
        Call<List<Comments>> call= RetrofitClient.getRetrofit().create(ApiServices.class).getCommentsWithId(id);
        getData(listener,call,requestCode);
    }
}
