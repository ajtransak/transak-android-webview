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
        myWebView.loadUrl("https://global-beta.transak.com?apiKey=02624956-010b-4775-8e31-7b9c8b82df76")
//        myWebView.loadUrl("https://docs.transak.com")
    }
}
