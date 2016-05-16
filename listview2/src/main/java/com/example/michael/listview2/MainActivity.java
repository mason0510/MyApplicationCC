package com.example.michael.listview2;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.provider.Contacts;
import android.provider.ContactsContract;
import android.support.v4.widget.CursorAdapter;
import android.support.v4.widget.SimpleCursorAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//BaseAdapter与指针适配器的使用
/*public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView= (ListView) findViewById(R.id.list_view);
        Cursor cursor=getContentResolver().query(Contacts.People.CONTENT_URI,null,null,null,null);
        startManagingCursor(cursor);//同步activity
        SimpleCursorAdapter simpleCursorAdapter=new SimpleCursorAdapter(this,R.layout.layout1,cursor,new String[]{Contacts.People.NAME},new int[]{R.id.textView});
        listView.setAdapter(simpleCursorAdapter);
        //填充的数据的字
        //填充的位置
    }
}*/
//baseadapter的使用 功能得以实现。
public class MainActivity extends Activity{

    private List<Map<String, Object>> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView= (ListView) findViewById(R.id.list_view);
        requestData();
        Myadapter myadapter=new Myadapter(this,list);

        listView.setAdapter(myadapter);
    }

    public List<Map<String,Object>> requestData(){
        list = new ArrayList();
        Map map=new HashMap() ;
        map.put("img",R.drawable.e);
        map.put("title","图片一");
        map.put("info","11111111111");
        list.add(map);
        map=new HashMap();
        map.put("img",R.drawable.e);
        map.put("title","图片二");
        map.put("info","22222222");
        list.add(map);
        return list;
    }
}