package com.example.lucky_tiger;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class TodayActivity extends AppCompatActivity {
    //声明控件
    private Button mTD1;
    private Button mTD2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_today);
//找到控件
        mTD1 = findViewById(R.id.btn_today_1);
        mTD2 = findViewById(R.id.btn_today_2);

        setListener();


    }
    private void setListener() {
        TodayActivity.OnClick onClick = new TodayActivity.OnClick();
        mTD1.setOnClickListener(onClick);
        mTD2.setOnClickListener(onClick);

            /*mTD1.setOnClickListener(this);
            mTD2.setOnClickListener(this);*/


    }

    private class OnClick implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent = null;

            if(v.getId() == R.id.btn_today_1) {
                intent = new Intent(TodayActivity.this, RecordActivity.class);
            }else if(v.getId() == R.id.btn_today_2) {
                intent = new Intent(TodayActivity.this, RecordActivity.class);
            }
            startActivity(intent);
        }


    }
}