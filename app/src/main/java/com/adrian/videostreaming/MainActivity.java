package com.adrian.videostreaming;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = findViewById(R.id.webView);
    }

    public void buttonPlayVideo(View view){
        webView.loadUrl("https://videos.files.wordpress.com/Fo0X2qAf/samplevideos2_hd.mp4");
    }
}