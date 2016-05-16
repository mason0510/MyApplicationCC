package com.example.michael.mylistview;

import android.app.Activity;
import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//简单的适配器
/*public class MainActivity extends ListActivity {//有且仅有一个List 内部维持一个list 如果要修改 你必须自定义 改成id /findviewbyid

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);//map类型的数据 映射
        SimpleAdapter adapter=new SimpleAdapter(getApplicationContext(),requestData(),R.layout.activity_main,new String[]{"iv","title","info"},new int[]{R.id.iv,R.id.title,R.id.info});
        setListAdapter(adapter);
    }
*//*    public List<String> requestData(){
        List<String> list=new ArrayList<>();
        for(int i=0;i<100;i++){
        list.add("打折促销"+list);//位置 或者 位置和数据
        }
        return list;
    }*//*
public List<Map<String,Object>> requestData(){//键名 obj的名字
        List<Map<String,Object>> list=new ArrayList<>();//iv title info
        Map<String,Object> map;
        map=new HashMap();//存放
        map.put("iv",R.drawable.a);
        map.put("title","女一号");
        map.put("info","谷歌创始人");
        list.add(map);
        map=new HashMap();//存放
        map.put("iv",R.drawable.b);
        map.put("title","风力发电");
        map.put("info","风力发电在新疆大规模使用");
        list.add(map);
        map=new HashMap();//存放
        map.put("iv",R.drawable.c);
        map.put("title","金刚组");
        map.put("info","世界上最悠久的建筑公司");
        list.add(map);
        return list;
    }
}*/
//第二种实现方式
//简单的适配器
/*public class MainActivity extends Activity {//有且仅有一个List 内部维持一个list 如果要修改 你必须自定义 改成id /findviewbyid

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);//map类型的数据 映射
        setContentView(R.layout.layout);//第二种实现方式
        ListView listView= (ListView) findViewById(R.id.list);
        SimpleAdapter adapter=new SimpleAdapter(getApplicationContext(),requestData(),R.layout.activity_main,new String[]{"iv","title","info"},new int[]{R.id.iv,R.id.title,R.id.info});
        listView.setAdapter(adapter);
    }
    *//*    public List<String> requestData(){
            List<String> list=new ArrayList<>();
            for(int i=0;i<100;i++){
            list.add("打折促销"+list);//位置 或者 位置和数据
            }
            return list;
        }*//*
    public List<Map<String,Object>> requestData(){//键名 obj的名字
        List<Map<String,Object>> list=new ArrayList<>();//iv title info
        Map<String,Object> map;
        map=new HashMap();//存放
        map.put("iv",R.drawable.a);
        map.put("title","女一号");
        map.put("info","谷歌创始人");
        list.add(map);
        map=new HashMap();//存放
        map.put("iv",R.drawable.b);
        map.put("title","风力发电");
        map.put("info","风力发电在新疆大规模使用");
        list.add(map);
        map=new HashMap();//存放
        map.put("iv",R.drawable.c);
        map.put("title","金刚组");
        map.put("info","世界上最悠久的建筑公司");
        list.add(map);
        return list;
    }
    //对项目的优化 添加头部

}*/
public class MainActivity extends Activity {//有且仅有一个List 内部维持一个list 如果要修改 你必须自定义 改成id /findviewbyid

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);//map类型的数据 映射
        setContentView(R.layout.layout);//第二种实现方式
        ListView listView = (ListView) findViewById(R.id.list);
        SimpleAdapter adapter = new SimpleAdapter(getApplicationContext(), requestData(), R.layout.activity_main, new String[]{"iv", "title", "info"}, new int[]{R.id.iv, R.id.title, R.id.info});
/*//添加文字
        TextView textView=new TextView(this);
        textView.setText(R.string.text);
        listView.addHeaderView(textView);
        listView.setAdapter(adapter);*/
/*//添加图片
        ImageView imageView=new ImageView(this);
        imageView.setImageResource(R.drawable.c);
        listView.addHeaderView(imageView);
        listView.setAdapter(adapter);*/
//添加布局文件
        listView.addHeaderView(LayoutInflater.from(this).inflate(R.layout.layout1,null));
        listView.setAdapter(adapter);
    }

    /*    public List<String> requestData(){
            List<String> list=new ArrayList<>();
            for(int i=0;i<100;i++){
            list.add("打折促销"+list);//位置 或者 位置和数据
            }
            return list;
        }*/
    public List<Map<String, Object>> requestData() {//键名 obj的名字
        List<Map<String, Object>> list = new ArrayList<>();//iv title info
        Map<String, Object> map;
        map = new HashMap();//存放
        map.put("iv", R.drawable.a);
        map.put("title", "女一号");
        map.put("info", "谷歌创始人");
        list.add(map);
        map = new HashMap();//存放
        map.put("iv", R.drawable.b);
        map.put("title", "风力发电");
        map.put("info", "风力发电在新疆大规模使用");
        list.add(map);
        map = new HashMap();//存放
        map.put("iv", R.drawable.c);
        map.put("title", "金刚组");
        map.put("info", "世界上最悠久的建筑公司");
        list.add(map);
        return list;
    }
}