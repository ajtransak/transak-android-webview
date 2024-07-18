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
        myWebView.loadUrl("https://global-beta.transak.com/?apiKey=4f4d1fff-3bba-4749-aa07-11d0667adbf4&themeColor=FDC809")
    }
}
