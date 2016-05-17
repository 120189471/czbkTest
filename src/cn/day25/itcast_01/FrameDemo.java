package cn.day25.itcast_01;

import java.awt.*;

/**
 * Created by Dix on 2016/5/17.
 */
public class FrameDemo {
    public static void main(String[] args) {
        //创建窗体
        Frame f=new Frame("Frame1");

        //窗体属性
        f.setTitle("FrameTitle");
        f.setSize(1024,768);
        f.setLocation(0,0);

        //f.show; 已过时
        f.setVisible(true);
        f.setResizable(true);


    }
}

