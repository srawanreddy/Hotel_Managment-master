package com.example.yiming.hotelmanagment.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.yiming.hotelmanagment.R;

import java.security.KeyStore;

import javax.crypto.Cipher;

public class MainActivity extends AppCompatActivity implements IViewActivityMain{


    private TextView fingerPrintInstructions;
    private IPresenterActivityMain iPresenterActivityMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iPresenterActivityMain = new PresenterActivityMain(MainActivity.this);
        fingerPrintFun();
    }

    @Override
    public void fingerPrintFun() {
        iPresenterActivityMain.onFingerPrintFunc();
    }

    @Override
    public void onSuccess() {
        Toast.makeText(this, "Authorization Success", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onFailure() {
        Toast.makeText(this, "Authorization Failed", Toast.LENGTH_LONG).show();
    }

}
