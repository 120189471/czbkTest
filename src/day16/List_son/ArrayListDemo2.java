package day16.List_son;

import java.util.ArrayList;
import java.util.Iterator;


/**
 * Created by Searis on 2016/3/22.
 * ArraryList练习2    对象练习
 */
public class ArrayListDemo2 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<Student> arrays=new ArrayList<Student>();

        //创建对象
        Student s1=new Student("浦发银行",600000);
        Student s2=new Student("50ETF",510050);
        Student s3=new Student("上证指数",000001);

        //添加元素
        arrays.add(s1);
        arrays.add(s2);
        arrays.add(s3);

        //遍历元素
        Iterator<Student> it=arrays.iterator();

        while (it.hasNext()){
            Student s=(Student)it.next();
            System.out.println(s.getName()+"---"+s.getAge());
        }

        System.out.println("--------------------------");
        for (Student s: arrays){
            System.out.println(s.getName()+"---"+s.getAge());

        }

        System.out.println("--------------------------");
        for (int x=0;x<arrays.size();x++){
            Student s=arrays.get(x);
            System.out.println(s.getName()+"---"+s.getAge());
        }

    }
}
