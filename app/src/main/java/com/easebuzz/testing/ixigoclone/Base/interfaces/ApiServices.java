package com.easebuzz.testing.ixigoclone.Base.interfaces;

import com.easebuzz.testing.ixigoclone.Base.managers.ApiUriManager;
import com.easebuzz.testing.ixigoclone.Base.models.BaseModel;
import com.easebuzz.testing.ixigoclone.Base.models.Response.Posts;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiServices {
    @GET(ApiUriManager.STATUS)
    Call<BaseModel> getPnrStatus(@Query("pnr") String pnrNumber);

    @GET(ApiUriManager.POSTS)
    Call<List<Posts>> getPosts();
}
