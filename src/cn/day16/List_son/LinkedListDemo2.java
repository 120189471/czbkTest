package cn.day16.List_son;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Searis on 2016/3/22.
 * LinkedList练习2 对象练习
 */
public class LinkedListDemo2 {
    public static void main(String[] args) {
        //创建对象
        LinkedList link = new LinkedList();

        Student s1 = new Student("当月连", 300013);
        Student s2 = new Student("下月连", 300016);
        Student s3 = new Student("当季连", 300019);
        Student s4 = new Student("当季连", 300012);

        link.add(s1);
        link.add(s2);
        link.add(s3);
        link.add(s4);

        for (Iterator it = link.iterator(); it.hasNext();) {
            Student s = (Student) it.next();
            System.out.println(s.getName() + "---" + s.getAge());
        }

        System.out.println("----------------------------------");
        for (int x = 0; x < link.size(); x++){
            Student s=(Student)link.get(x);
            System.out.println(s.getName()+"---"+s.getAge());
        }
    }
}
