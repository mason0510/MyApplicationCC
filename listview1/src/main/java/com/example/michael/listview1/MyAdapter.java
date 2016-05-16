package com.example.michael.listview1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Michael on 2016/5/15.
 */
public class MyAdapter extends ArrayAdapter<Fruit> {
    Context context;
    public MyAdapter(Context context, int resource, List<Fruit> objects) {
        super(context, resource, objects);
        this.context=context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        Fruit fruit=getItem(position);
        Holder holder=new Holder();
        if(convertView==null){
            view= LayoutInflater.from(context).inflate(R.layout.layout1,null);
            holder.imageView= (ImageView) view.findViewById(R.id.iv);
            holder.textView=(TextView) view.findViewById(R.id.tv);
            //保存
            view.setTag(holder);
            view.findViewById(R.id.tv);
        }else {
            view=convertView;
            holder= (Holder) view.getTag();//取出
        }
        holder.imageView.setImageResource(fruit.getImg());
        holder.textView.setText(fruit.getName());
        return view;
    }
    class Holder{
        ImageView imageView;
        TextView textView;

    }
}
