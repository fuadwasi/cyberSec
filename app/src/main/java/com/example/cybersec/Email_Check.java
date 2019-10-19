package com.example.cybersec;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Email_Check extends AppCompatActivity {
    WebView we_v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email__check);

        we_v = findViewById(R.id.web_but);
        we_v.setWebViewClient(new WebViewClient());
        we_v.loadUrl("https://haveibeenpwned.com/");
    }
}
