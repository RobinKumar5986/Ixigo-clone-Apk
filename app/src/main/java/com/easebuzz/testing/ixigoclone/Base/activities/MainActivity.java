package com.easebuzz.testing.ixigoclone.Base.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.easebuzz.testing.ixigoclone.Base.interfaces.ApiServices;
import com.easebuzz.testing.ixigoclone.Base.interfaces.ResponseListener;
import com.easebuzz.testing.ixigoclone.Base.interseptor.RetrofitClient;
import com.easebuzz.testing.ixigoclone.Base.managers.ApiManager;
import com.easebuzz.testing.ixigoclone.Base.managers.ApiUriManager;
import com.easebuzz.testing.ixigoclone.Base.models.BaseModel;
import com.easebuzz.testing.ixigoclone.Base.models.Response.Posts;
import com.easebuzz.testing.ixigoclone.Base.utils.ApiCallingMethods;
import com.easebuzz.testing.ixigoclone.R;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity implements ResponseListener<Posts> {
    TextView statusResponse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        statusResponse=findViewById(R.id.txtPnrResponse);
//        ApiManager apiManager = new ApiManager();
//        Retrofit retrofit = RetrofitClient.getRetrofit();
//        ApiServices apiService;
//        apiService = retrofit.create(ApiServices.class);
//        Call<List<Posts>> call=apiService.getPosts();
//        apiManager.getPosts(this,call);
        ApiCallingMethods.getAllPost(this,1001);
    }

    @Override
    public void onSuccess(List<Posts> data,Integer requestCode) {
        String singleEle="";
        for(Posts ele : data){
            singleEle= ele.getUserId()+"\n"+
                    ele.getId()+"\n"+
                    ele.getTitle()+"\n"+
                    ele.getBody()+"\n\n";
            statusResponse.append(singleEle);
        }
    }
    @Override
    public void onError(String errorMessage,Integer requestCode) {
        Toast.makeText(MainActivity.this, errorMessage, Toast.LENGTH_SHORT).show();
    }
}