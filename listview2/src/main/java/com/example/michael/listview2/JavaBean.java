package com.example.michael.listview2;

/**
 * Created by Michael on 2016/5/15.
 */
public class JavaBean {
    int img;
    String title;
    String info;

    public JavaBean(int img, String info, String title) {
        this.img = img;
        this.info = info;
        this.title = title;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
