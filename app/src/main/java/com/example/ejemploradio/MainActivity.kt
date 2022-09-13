package com.example.ejemploradio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import androidx.fragment.app.FragmentActivity

class MainActivity : FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        radioFormula()
    }

    private fun radioFormula(){
        //var url= "https://mdstrm.com/live-stream-playlist/61e1e088d04d7744686afc42.m3u8"
        //MyPlayer = MediaPlayer()
        //   val myWebView = WebView(activityContext)


        val myWebView: WebView = findViewById(R.id.webview2)

        myWebView.loadUrl("https://mdstrm.com/live-stream-playlist/61e1e088d04d7744686afc42.m3u8")

    }

}