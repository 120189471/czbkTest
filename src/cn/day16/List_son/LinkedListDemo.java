package cn.day16.List_son;

import java.util.LinkedList;
import java.util.Iterator;


/**
 * Created by Searis on 2016/3/22.
 * <p>
 * LinkedList练习
 */
public class LinkedListDemo {

    public static void main(String[] args) {
        //创建LinkedList对象集合
        LinkedList<String> link = new LinkedList<String>();

        //增加集合元素
        link.add("Hello");
        link.add("World");
        link.add("Java");

        //遍历对象
        Iterator<String> it = link.iterator();
        while (it.hasNext()) {
            String s = (String) it.next();
            System.out.println(s);
        }

        System.out.println("--------------------");
        for (int x = 0; x < link.size(); x++) {
            String s = (String) link.get(x);
            System.out.println(s);
        }

        System.out.println("--------------------");
        for (String s : link) {
            System.out.println(s);
        }
    }
}
