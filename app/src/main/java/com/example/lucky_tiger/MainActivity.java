package com.example.lucky_tiger;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.lucky_tiger.util.ToastUtil;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    //声明控件
    private Button mBtnLogin;
    private EditText mEtUser;
    private EditText mEtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //找到控件
        mBtnLogin = findViewById(R.id.btn_login);
        mEtUser = findViewById(R.id.et_1);
        mEtPassword = findViewById((R.id.et_2));

        /*实现跳转1
        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = null;
                intent = new Intent(MainActivity.this, FunctionActivity.class);
                startActivity(intent);
            }
        });*/
        mBtnLogin.setOnClickListener(this);
        //匹配用户名和密码才能登录操作
    }
    public void onClick(View v){
        //需要获取输入的用户名和密码
        String username = mEtUser.getText().toString();
        String password = mEtPassword.getText().toString();
        //弹出的内容设置
        String ok = "登录成功";
        String fail = "密码或账号有误，请重新登录！";
        Intent intent = null;
        //假设正确的账号密码是pms,123456
        if(username.equals("nau") && password.equals("123456")){
            //toast 普通版
            //Toast.makeText(getApplicationContext(), ok,Toast.LENGTH_SHORT).show();
            //封装好的类
            ToastUtil.showMsg(MainActivity.this,ok);
            //如果正确进行跳转；
            intent = new Intent(MainActivity.this, SlideActivity.class);
            startActivity(intent);
        }else {
            //不正确，就弹出登录失败toast
            /*toast 提升版
            Toast toastCenter = Toast.makeText(getApplicationContext(),fail,Toast.LENGTH_SHORT);
            toastCenter.setGravity(Gravity.CENTER,0,0);
            toastCenter.show();
*/
            ToastUtil.showMsg(MainActivity.this, fail);
        }
    }
    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}