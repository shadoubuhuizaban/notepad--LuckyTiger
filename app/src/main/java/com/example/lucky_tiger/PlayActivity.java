package com.example.lucky_tiger;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PlayActivity extends AppCompatActivity {
    //声明控件
    private Button mPL1;
    private Button mPL2;
    private Button mPL3;
    private Button mPL4;
    private Button mPL5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
//找到控件
        mPL1 = findViewById(R.id.btn_play_1);
        mPL2 = findViewById(R.id.btn_play_2);
        mPL3 = findViewById(R.id.btn_play_3);
        mPL4 = findViewById(R.id.btn_play_4);
        mPL5 = findViewById(R.id.btn_play_5);

        setListener();


    }
    private void setListener() {
        PlayActivity.OnClick onClick = new PlayActivity.OnClick();
        mPL1.setOnClickListener(onClick);
        mPL2.setOnClickListener(onClick);
        mPL3.setOnClickListener(onClick);
        mPL4.setOnClickListener(onClick);
        mPL5.setOnClickListener(onClick);

            /*mTD1.setOnClickListener(this);
            mTD2.setOnClickListener(this);*/


    }

    private class OnClick implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent = null;

            if(v.getId() == R.id.btn_play_1) {
                intent = new Intent(PlayActivity.this,StandardActivity.class );
            }else if(v.getId() == R.id.btn_play_2) {
                intent = new Intent(PlayActivity.this, ClassifyActivity.class);
            }else if(v.getId() == R.id.btn_play_3) {
                intent = new Intent(PlayActivity.this, LevelActivity.class);
            }else if(v.getId() == R.id.btn_play_4) {
                intent = new Intent(PlayActivity.this, PreventActivity.class);
            }else if(v.getId() == R.id.btn_play_5) {
                intent = new Intent(PlayActivity.this, AgeActivity.class);
            }
            startActivity(intent);
        }


    }
}