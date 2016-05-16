package com.example.michael.appservice;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import java.io.File;
import java.io.IOException;

//完成打印 一段话 本地调试成功再使用
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button;
    private MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startService(new Intent(MainActivity.this,MyService.class));
            }
        });
        //测试播放与暂停
        RelativeLayout relativeLayout= (RelativeLayout) findViewById(R.id.layout);
        for(int i=0;i<relativeLayout.getChildCount();i++){
            View view=relativeLayout.getChildAt(i);//找出相应的布局 分别设置监听器
            view.setOnClickListener(this);

        }
        initPlayer();

    }


    public void initPlayer(){
        if(player==null){//相对路径
            player=new MediaPlayer();//区别于获取第二次的绝对路径
            try {
                File file=new File(Environment.getExternalStorageDirectory(),"aa.mp3");
                player.setDataSource(file.getPath());//第一层路径
                Log.d("MainActvity",file.getPath());//看路径是否正确
                player.prepare();
                Log.d("MainActvity","准备状态");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.btn2:
                //播放
                if (!player.isPlaying()){
                    player.start();
                }
                Log.d("MainActvity","播放");
                break;
            case R.id.btn3:
                //暂停
                if (player.isPlaying()){
                    player.pause();
                }
                Log.d("MainActvity","暂停");
                break;
            case R.id.btn4:
                if(player.isPlaying()){
                    player.reset();
                    try {
                       initPlayer();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                Log.d("MainActvity","停止");
                //停止
                break;
            case R.id.btn5:
                //退出
                if(player!=null){
                    player.stop();
                    player.release();
                }
                System.exit(0);
                break;
            default:
                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();//继承父类的构造 空实现
        if(player!=null){
            player.stop();
            player.release();
        }

    }
}
