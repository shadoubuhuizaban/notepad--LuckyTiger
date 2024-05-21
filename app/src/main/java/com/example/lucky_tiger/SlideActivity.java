package com.example.lucky_tiger;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lucky_tiger.util.ToastUtil;

public class SlideActivity extends AppCompatActivity {
    public static int btn_main_1;
    //声明控件
    private ImageView mIvhead;
    private SlideMenu slideMenu;
    private Button mBtnToday;
    private Button mBtnRecord;
    private Button mBtnQToday;
    private Button mBtnQRecord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_slide);
        //找到控件
        mIvhead = findViewById(R.id.iv_head);
        slideMenu = findViewById(R.id.slideMenu);
        mBtnToday = findViewById(R.id.btn_main_1);
        mBtnRecord = findViewById(R.id.btn_main_2);
        mBtnQToday = findViewById(R.id.btn_main_3);
        mBtnQRecord = findViewById(R.id.btn_main_4);


        //实现侧滑部分，点击加侧滑
        mIvhead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                slideMenu.switchMenu();
                ToastUtil.showMsg(SlideActivity.this,"ok");
            }
        });
        setListener();
    }
    private void setListener() {
        OnClick onClick = new OnClick();
        //对每一个按钮进行setOnClickListener
        mBtnToday.setOnClickListener(onClick);
        mBtnRecord.setOnClickListener(onClick);
        mBtnQToday.setOnClickListener(onClick);
        mBtnQRecord.setOnClickListener(onClick);

    }

    private class OnClick implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent = null;

            if(v.getId() == R.id.btn_main_1) {
                intent = new Intent(SlideActivity.this, TodayActivity.class);
            }else if(v.getId() == R.id.btn_main_2) {
                intent = new Intent(SlideActivity.this, RecordActivity.class);
            }else if(v.getId() == R.id.btn_main_3) {
                intent = new Intent(SlideActivity.this, TodayActivity.class);
            }else if(v.getId() == R.id.btn_main_4) {
                intent = new Intent(SlideActivity.this, RecordActivity.class);
            }
            startActivity(intent);
        }
    }
}