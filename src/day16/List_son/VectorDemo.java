package day16.List_son;

import java.util.Iterator;
import java.util.Vector;

/**
 * Created by Searis on 2016/3/22.
 *
 * Vector练习
 */
public class VectorDemo {
    public static void main(String[] args) {

        //创建Vector集合对象
        Vector<String> v=new Vector<String>();

        //创建对象元素
        v.add("Hello");
        v.add("World");
        v.add("Java");

        Iterator<String> it=v.iterator();

        while(it.hasNext()){
            String s=(String)it.next();
            System.out.println(s);

        }
        System.out.println("----------------");

        for (int x=0;x<v.size();x++){
            String s=(String)v.get(x);
            System.out.println(s);
        }


    }
}
