package com.easebuzz.testing.ixigoclone.Base.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import com.easebuzz.testing.ixigoclone.Base.interfaces.ResponseListener;
import com.easebuzz.testing.ixigoclone.Base.utils.ApiCallingMethods;
import com.easebuzz.testing.ixigoclone.R;
import java.util.List;

public class MainActivity<T> extends AppCompatActivity implements ResponseListener<T> {
    TextView statusResponse;
    TextView comments;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        statusResponse=findViewById(R.id.txtPnrResponse);
        comments=findViewById(R.id.txtPosts);
        ApiCallingMethods.getPnrStatus(this,"43613658",1003);
    }

    @Override
    public void onSuccess(List<T> data, Integer requestCode) {
    }

    @Override
    public void onError(String errorMessage, Integer requestCode) {
        Toast.makeText(this, errorMessage, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSuccess(T data, Integer requestCode) {

    }
}