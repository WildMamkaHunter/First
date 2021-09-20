package com.example.stivan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.net.URL;

public class NewActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_activity);

        WebView webView = findViewById(R.id.webview1);

        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://www.youtube.com/watch?v=9Az3DhCIFQ0");

        WebViewClient webViewClient = new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url)
            {
                view.loadUrl(url);
                return super.shouldOverrideUrlLoading(view, url);
            }

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request)
            {
                view.loadUrl(request.getUrl().toString());
                return super.shouldOverrideUrlLoading(view, request);
            }
        };
        webView.setWebViewClient(webViewClient);

        Intent intent = getIntent();

        String message1 = intent.getStringExtra("Name");
        String message2 = intent.getStringExtra("SName");
        String message3 = intent.getStringExtra("TName");
        String message4 = intent.getStringExtra("Date");
        String message5 = intent.getStringExtra("Email");

        TextView messageText1 = (TextView) findViewById(R.id.textView2);
        TextView messageText2 = (TextView) findViewById(R.id.textView3);
        TextView messageText3 = (TextView) findViewById(R.id.textView4);
        TextView messageText4 = (TextView) findViewById(R.id.textView5);
        TextView messageText5 = (TextView) findViewById(R.id.textView6);

        messageText1.setText(message1);
        messageText2.setText(message2);
        messageText3.setText(message3);
        messageText4.setText(message4);
        messageText5.setText(message5);
    }
}
