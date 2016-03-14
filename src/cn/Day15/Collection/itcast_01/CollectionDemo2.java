package cn.Day15.Collection.itcast_01;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Searis on 2016/3/14.
 *
 * Collection功能２
 *
 * boolean addAll(Collection c):添加一个集合的元素
 * boolean removeAll(Collection c):移除一个集合的元素(是一个还是所有)
 * boolean containsAll(Collection c)：判断集合中是否包含指定的集合元素(是一个还是所有)
 * boolean retainAll(Collection c):两个集合都有的元素?思考元素去哪了，返回的boolean又是什么意思呢?
 */
public class CollectionDemo2 {
    public static void main(String[] args){

        Collection c1=new ArrayList();
        c1.add("c1add1");
        c1.add("c1add2");
        c1.add("c1add3");
        c1.add("c1add4");

        Collection c2=new ArrayList();
        c2.add("cadd1");
        c2.add("c2add2");
        c2.add("cadd3");

        //只要有一个被添加就返回TRUE
        //System.out.println(c1.addAll(c2));

        /*
        //只要有一个被移除就返回true
        System.out.println(c1.removeAll(c2));
        */
        //所有被包含才显示TRUE，否则显示false
        //System.out.println(c1.containsAll(c2));

        //A对B做交集，结果返回到A中，B保持不变
        //返回至表示A是否发生变化
        //A如果是空集，结果为False
        //B如果是空集，结果为True
        System.out.println(c1.retainAll(c2));

        System.out.println(c1);
        System.out.println(c2);
        System.out.println("----------");

        Object[] object=c2.toArray();
        for (int x=0; x<object.length;x++){
            System.out.println(object[x]);
        }
        System.out.println("----------");
        for (int x=0;x<object.length;x++){
            System.out.println((String)object[x]);
        }
    }
}
