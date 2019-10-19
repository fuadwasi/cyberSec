package com.example.cybersec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import java.util.List;


public class SpeedTest extends AppCompatActivity {

    WebView sp_v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speed_test);

       sp_v = findViewById(R.id.spe_but);
       sp_v.setWebViewClient(new WebViewClient());
       sp_v.loadUrl("https://www.speedtest.net/");
       sp_v.getSettings().setJavaScriptEnabled(true);



    }

}
