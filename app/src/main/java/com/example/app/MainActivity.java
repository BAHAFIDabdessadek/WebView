package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;

import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView webView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView1 =(WebView) findViewById(R.id.webview1);
        webView1.setWebViewClient(new WebViewClient());

        webView1.loadUrl("https://www.Multimillionnaire.com/");

        WebSettings webSettings = webView1.getSettings();
        webSettings.setJavaScriptEnabled(true);



    }

    public class WebView1 extends WebViewClient{
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }

    @Override
    public void onBackPressed() {
        if (webView1.canGoBack()){
            webView1.goBack();
        }else{
            super.onBackPressed();
        }
    }
}