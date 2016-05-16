package com.example.michael.listview1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

//ArrayAdapter ---BaseAdapter
/*public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView= (ListView) findViewById(R.id.list);//空间的id
        ArrayAdapter<String> adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,requestData());
        listView.setAdapter(adapter);
    }

        public List<String> requestData() {
            List<String> list = new ArrayList<>();
            for (int i = 0; i < 100; i++) {
                list.add("打折促销" + i);//位置 或者 位置和数据
            }
            return list;
        }
}*/
//复杂的布局
//继承BaseAdapter
//自定义arrayAdapter

public class MainActivity extends AppCompatActivity {

    private List<Fruit> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        ListView listView= (ListView) findViewById(R.id.list);//空间的id
        //rrayAdapter<String> adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,requestData());
        MyAdapter adapter=new MyAdapter(this,R.layout.layout1,requestData());
        listView.setAdapter(adapter);
        listView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return false;
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {//view 位置  id
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //点击出现一列数
                Fruit fruit=list.get(position);//获取对应位置的数据
                Log.d("MainActivity",fruit.getName());
            }
        });
    }

    public List<Fruit> requestData() {
        list = new ArrayList<>();
        //第一种写法
        /*for (int i = 0; i < 100; i++) {
            list.add("打折促销" + i);//位置 或者 位置和数据
        }*/
        //第二种写法

        Fruit fruit=new Fruit(R.drawable.d,"水果一");
        list.add(fruit);
        fruit=new Fruit(R.drawable.d,"水果二");
        list.add(fruit);
        fruit=new Fruit(R.drawable.d,"水果三");
        list.add(fruit);
        return list;
    }
    //点击监听的实现

}