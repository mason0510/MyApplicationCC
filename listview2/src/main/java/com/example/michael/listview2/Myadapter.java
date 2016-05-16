package com.example.michael.listview2;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;
import java.util.Map;

/**
 * Created by Michael on 2016/5/15.
 */
public class Myadapter extends BaseAdapter {
    Context context;
    List<Map<String,Object>> list;
    public Myadapter(Context context, List<Map<String,Object>> list) {
        this.context=context;
        this.list=list;
    }

    @Override
    public int getCount() {//
        return 2;
    }

    @Override
    public Object getItem(int position) {//获取数据集中与指定索引对应的数据项
        return position;
    }

    @Override
    public long getItemId(int position) {//获取数据与所用对应的的Id
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        getItem(position);
        Holder holder=new Holder();
        if(convertView==null){
            view= LayoutInflater.from(context).inflate(R.layout.layout,null);
            holder.imageView= (ImageView) view.findViewById(R.id.img);
            holder.textView= (TextView) view.findViewById(R.id.title);
            holder.info= (TextView) view.findViewById(R.id.info);
            holder.button= (Button) view.findViewById(R.id.view_btn);
            view.setTag(holder);
        }else {
            view=convertView;
            holder= (Holder) view.getTag();
        }
        holder.imageView.setImageResource((Integer) list.get(position).get("img"));
        holder.textView.setText((String) list.get(position).get("title"));
        holder.textView.setText((String) list.get(position).get("info"));
        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("myAdapter","button");
            }
        });
        return view;
    }
    class Holder{
        ImageView imageView;
        TextView textView;
        TextView info;
        Button button;
    }
}
