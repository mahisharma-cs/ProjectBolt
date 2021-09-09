package com.package.name;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_main);
        Context context = this;

        WebView wb = findViewById(R.id.web_id);
        wb.setWebViewClient(new WebViewClient(){
                        
        });
        wb.getSettings().setJavaScriptEnabled(true);
        wb.setVerticalScrollBarEnabled(true);

        wb.getSettings().setDomStorageEnabled(true);
        wb.getSettings().setSaveFormData(true);
        wb.getSettings().setAllowContentAccess(true);
        wb.getSettings().setAllowFileAccess(true);
        wb.getSettings().setAllowFileAccessFromFileURLs(true);
        wb.getSettings().setAllowUniversalAccessFromFileURLs(true);
        wb.getSettings().setSupportZoom(true);
        wb.setWebViewClient(new WebViewClient());
        wb.setClickable(true);
        wb.setWebChromeClient(new WebChromeClient());

        StringL URL = new StringL();
        String url = URL.the_URL;

        wb.bringToFront();
        wb.loadUrl(url);
    }
}
