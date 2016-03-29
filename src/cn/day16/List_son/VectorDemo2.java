package cn.day16.List_son;

import java.util.Iterator;
import java.util.Vector;

/**
 * Created by Searis on 2016/3/22.
 * VectorDemo练习 对象练习
 */
public class VectorDemo2 {
    public static void main(String[] args) {
        //创建Vector集合
        Vector v = new Vector();

        //创建元素对象
        Student s1 = new Student("深证成指", 399001);
        Student s2 = new Student("平安银行", 000001);
        Student s3 = new Student("总成交", 395099);

        //添加元素
        v.add(s1);
        v.add(s2);
        v.add(s3);

        //遍历元素
        Iterator it = v.iterator();
        while (it.hasNext()) {
            Student s = (Student) it.next();
            System.out.println(s.getName() + "---"+s.getAge());
        }

        System.out.println("-----------------------");
        for (int x=0;x<v.size();x++){
            Student s=(Student)v.get(x);
            System.out.println(s.getName() + "---"+s.getAge());
        }

    }
}
