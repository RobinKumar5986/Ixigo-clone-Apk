package com.easebuzz.testing.ixigoclone.Base.interfaces;

import java.util.List;

public interface ResponseListener<T>{
    void onSuccess(List<T> data,Integer requestCode);
    void onError(String errorMessage,Integer requestCode);
}
