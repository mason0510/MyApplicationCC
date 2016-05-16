package com.example.michael.myapplicationcc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//需求 完成调用服务端代码 打印数据。 使用eventbus。
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//接收view以及其子类listview 具有各种功能
        //手动开启服务
        //远程调用服务
    }
}
