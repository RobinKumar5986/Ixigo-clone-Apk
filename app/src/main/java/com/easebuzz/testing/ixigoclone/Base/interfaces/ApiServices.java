package com.easebuzz.testing.ixigoclone.Base.interfaces;

import com.easebuzz.testing.ixigoclone.Base.managers.ApiUriManager;
import com.easebuzz.testing.ixigoclone.Base.models.Response.Comments;
import com.easebuzz.testing.ixigoclone.Base.models.Response.Posts;
import com.easebuzz.testing.ixigoclone.Base.models.Response.TrainInfo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiServices {
    @GET(ApiUriManager.STATUS)
    Call<TrainInfo> getPnrStatus(@Query("pnr") String pnrNumber);

    @GET(ApiUriManager.POSTS)
    Call<List<Posts>> getPosts();

    @GET(ApiUriManager.COMMENTS)
    Call<List<Comments>> getComments(@Path("id") String id);

    @GET(ApiUriManager.COMMENTS_ID)
    Call<List<Comments>> getCommentsWithId(@Query("postId") String id);

}
