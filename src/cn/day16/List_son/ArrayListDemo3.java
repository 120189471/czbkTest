package cn.day16.List_son;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Searis on 2016/3/22.
 * ArrrayList练习
 *  去除重复对象
 */
public class ArrayListDemo3 {
    public static void main(String[] args) {
        //创建集合
        ArrayList arrays=new ArrayList();

        //创建对象
        Student s1=new Student("浦发银行",600000);
        Student s2=new Student("50ETF",510050);
        Student s3=new Student("上证指数1",000001);
        Student s4=new Student("上证指数2",000001);
        Student s5=new Student("上证指数",000001);
        Student s6=new Student("上证指数",000001);
        Student s7=new Student("上证指数",000001);

        //添加元素
        arrays.add(s1);
        arrays.add(s2);
        arrays.add(s3);
        arrays.add(s4);
        arrays.add(s5);
        arrays.add(s6);
        arrays.add(s7);

        ArrayList newArrays=new ArrayList();
       /* for (Iterator it=arrays.iterator();it.hasNext();){
            Student s=(Student)it.next();
            if (!newArrays.contains(s)){
                newArrays.add(s);
            }
        }*/

        Iterator it=arrays.iterator();
        while (it.hasNext()){
            Student s=(Student)it.next();
            if (!newArrays.contains(s)){
                newArrays.add(s);
            }
        }
        for (int x=0;x<newArrays.size();x++){
            Student s=(Student)newArrays.get(x);
            System.out.println(s.getName()+"---"+s.getAge());
        }
    }
}
