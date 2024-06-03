package com.example.lucky_tiger;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FoodActivity extends AppCompatActivity {
    //声明控件
    private Button mFD1;
    private Button mFD2;
    private Button mFD3;
    private Button mFD4;
    private Button mFD5;
    private Button mFD6;
    private Button mFD7;
    private WebView webView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
//找到控件
        mFD1 = findViewById(R.id.btn_food_1);
        mFD2 = findViewById(R.id.btn_food_2);
        mFD3 = findViewById(R.id.btn_food_3);
        mFD4 = findViewById(R.id.btn_food_4);
        mFD5 = findViewById(R.id.btn_food_5);
        mFD6 = findViewById(R.id.btn_food_6);
        mFD7 = findViewById(R.id.btn_food_7);
        webView = findViewById(R.id.webView);

        // 配置WebView
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());

        // 初始隐藏WebView
        webView.setVisibility(View.GONE);

        setListener();
    }

    private void setListener() {
        FoodActivity.OnClick onClick = new FoodActivity.OnClick();
        mFD1.setOnClickListener(onClick);
        mFD2.setOnClickListener(onClick);
        mFD3.setOnClickListener(onClick);
        mFD4.setOnClickListener(onClick);
        mFD5.setOnClickListener(onClick);
        mFD6.setOnClickListener(onClick);
        mFD7.setOnClickListener(onClick);
    }

    private class OnClick implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            String url = "";

            if(v.getId() == R.id.btn_food_1) {
                url = "http://www.sojump.com/jq/4003378.aspx";
            }else if(v.getId() == R.id.btn_food_2) {
                url ="http://www.sojump.com/jq/3981842.aspx";;
            }else if(v.getId() == R.id.btn_food_3) {
                url = "http://www.sojump.com/jq/4002257.aspx";
            }else if(v.getId() == R.id.btn_food_4) {
                url ="http://www.sojump.com/jq/3998179.aspx";
            }else if(v.getId() == R.id.btn_food_5) {
                url ="http://www.sojump.com/jq/176294.aspx";
            }else if(v.getId() == R.id.btn_food_6) {
                url ="http://www.sojump.com/jq/4034654.aspx";
            }else if(v.getId() == R.id.btn_food_7) {
                url ="http://www.sojump.com/jq/4046331.aspx";
            }

            if (!url.isEmpty()) {
                webView.setVisibility(View.VISIBLE); // 显示WebView
                webView.loadUrl(url);
            }

        }

    }

}