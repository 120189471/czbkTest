package cn.day16.Generic.itcast_01;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Searis on 2016/3/23.
 */
public class ArrayListDemo {
    public static void main(String[] args){
        //创建集合
        ArrayList<Student> arrays=new ArrayList<Student>();

        //创建元素
        Student s1=new Student("宇宙",9);
        Student s2=new Student("地球",3);
        Student s3=new Student("木星",4);

        //添加元素
        arrays.add(s1);
        arrays.add(s2);
        arrays.add(s3);

        //遍历元素
        for(Iterator<Student> it=arrays.iterator();it.hasNext();){
            Student s=it.next();
            System.out.println(s.getName()+"---"+s.getAge());
        }
        System.out.println("------------------------");
        //增强for遍历对象
        for(Student s: arrays){
            System.out.println(s.getName()+"---"+s.getAge());
        }
    }
}
