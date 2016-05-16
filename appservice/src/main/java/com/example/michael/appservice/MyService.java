package com.example.michael.appservice;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by Michael on 2016/5/15.
 */
public class MyService extends Service {
    MediaPlayer mediaPlayer;
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
       MyBinder myBinder=new MyBinder();
        return myBinder;
    }
    public class MyBinder extends Binder implements Iservice{
        @Override
        public void play() {

        }

        @Override
        public void stop() {

        }

        @Override
        public void pause() {

        }//偷梁换柱

    }
    //初始化播放器

}
