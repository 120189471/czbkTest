package cn.day16.Generic.itcast_01;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Searis on 2016/3/23.
 * <p>
 * 泛型练习
 */
public class GenricDemo {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> arrays = new ArrayList<String>();
        //添加元素
        arrays.add("Hello");
        arrays.add("world");
        arrays.add("Java");

        Iterator<String> it = arrays.iterator();
        while (it.hasNext()){
            String s= it.next();
            System.out.println(s);
        }
    }
}
