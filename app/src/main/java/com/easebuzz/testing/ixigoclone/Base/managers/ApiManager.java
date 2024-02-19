package com.easebuzz.testing.ixigoclone.Base.managers;

import android.app.Activity;
import android.util.Log;
import android.widget.Toast;

import com.easebuzz.testing.ixigoclone.Base.interfaces.ResponseListener;
import com.easebuzz.testing.ixigoclone.Base.models.Response.TrainInfo;
import com.easebuzz.testing.ixigoclone.Base.utils.LoggerUtil;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
public class ApiManager{

    /***
     @INOF: getData() can be used to handel any type of Type of JSON response with initial return type as List<<Object>>
     @Created_By : Robin Kumar (20/02/2024)
     ***/
    public static <T> void getData(final ResponseListener<T> callback, Call<List<T>> call,final Integer requestCode) {
        call.enqueue(new Callback<List<T>>() {
            @Override
            public void onResponse(Call<List<T>> call, Response<List<T>> response) {
                if (!response.isSuccessful()) {
                    callback.onError("Code: " + response.code(),requestCode);
                } else {
                    List<T> body = response.body();
                    LoggerUtil.printLog(response);
                    callback.onSuccess(body,requestCode);
                }
            }
            @Override
            public void onFailure(Call<List<T>> call, Throwable t) {
                callback.onError(t.getMessage(),requestCode);

            }
        });
    }

    /***
     *
     * @param callback
     * @param call
     * @param requestCode
     * @param <T>
     *     Manager fro the Train Status Url and It can handel other ULS.
     *     TODO: NEE TO ADD APIS FOR OTHER OPERATIONS ALSO.
     */

    public  static <T> void getRailwayData(final  ResponseListener<T> callback,Call<T> call,final Integer requestCode){
        call.enqueue(new Callback<T>() {
            @Override
            public void onResponse(Call<T> call, Response<T> response) {
                if (!response.isSuccessful()) {
                    callback.onError("Code: " + response.code(),requestCode);
                } else {
                    T body = response.body();
                    LoggerUtil.printLog(response);
                    callback.onSuccess(body,requestCode);
                }
            }

            @Override
            public void onFailure(Call<T> call, Throwable t) {

            }
        });
    }
}
