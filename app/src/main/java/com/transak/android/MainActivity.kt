package com.transak.android

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import android.webkit.WebView

class MainActivity : ComponentActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val myWebView: WebView = findViewById(R.id.webview)
        myWebView.settings.javaScriptEnabled = true
//        myWebView.loadUrl("https://global-stg.transak.com?apiKey=d79671a4-b021-4a4f-a444-6862a680a94b")
        myWebView.loadUrl("https://docs.transak.com")
    }
}
