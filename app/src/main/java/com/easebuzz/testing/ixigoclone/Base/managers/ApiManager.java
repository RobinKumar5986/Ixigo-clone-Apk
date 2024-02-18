package com.easebuzz.testing.ixigoclone.Base.managers;

import com.easebuzz.testing.ixigoclone.Base.interfaces.ResponseListener;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
public class ApiManager{
    public static <T> void getData(final ResponseListener<T> callback, Call<List<T>> call,final Integer requestCode) {
        call.enqueue(new Callback<List<T>>() {
            @Override
            public void onResponse(Call<List<T>> call, Response<List<T>> response) {
                if (!response.isSuccessful()) {
                    callback.onError("Code: " + response.code(),requestCode);
                } else {
                    List<T> body = response.body();
                    callback.onSuccess(body,requestCode);
                }
            }
            @Override
            public void onFailure(Call<List<T>> call, Throwable t) {
                callback.onError(t.getMessage(),requestCode);
            }
        });
    }
}
