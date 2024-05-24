package com.example.lucky_tiger;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class FoodActivity extends AppCompatActivity {
    //声明控件
    private Button mFD1;
    private Button mFD2;
    private Button mFD3;
    private Button mFD4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
//找到控件
        mFD1 = findViewById(R.id.btn_food_1);
        mFD2 = findViewById(R.id.btn_food_2);
        mFD3 = findViewById(R.id.btn_food_3);
        mFD4 = findViewById(R.id.btn_food_4);

        setListener();


    }
    private void setListener() {
        FoodActivity.OnClick onClick = new FoodActivity.OnClick();
        mFD1.setOnClickListener(onClick);
        mFD2.setOnClickListener(onClick);
        mFD3.setOnClickListener(onClick);
        mFD4.setOnClickListener(onClick);

            /*mTD1.setOnClickListener(this);
            mTD2.setOnClickListener(this);*/


    }

    private class OnClick implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent = null;

            if(v.getId() == R.id.btn_food_1) {
                intent = new Intent(FoodActivity.this, RecordActivity.class);
            }else if(v.getId() == R.id.btn_food_2) {
                intent = new Intent(FoodActivity.this, RecordActivity.class);
            }else if(v.getId() == R.id.btn_food_3) {
                intent = new Intent(FoodActivity.this, RecordActivity.class);
            }else if(v.getId() == R.id.btn_food_4) {
                intent = new Intent(FoodActivity.this, RecordActivity.class);
            }
            startActivity(intent);
        }


    }
}