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
        myWebView.settings.domStorageEnabled = true

        myWebView.loadUrl("https://global-stg.transak.com/?apiKey=a2374be4-c59a-400e-809b-72c226c74b8f&redirectURL=https://transak.com")

        myWebView.clearCache(true)
        myWebView.clearHistory()
    }
}
