package cn.day16.Generic.itcast_01;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Searis on 2016/3/23.
 */
public class ArrayListDemo {
    public static void main(String[] args){
        //��������
        ArrayList<Student> arrays=new ArrayList<Student>();

        //����Ԫ��
        Student s1=new Student("����",9);
        Student s2=new Student("����",3);
        Student s3=new Student("ľ��",4);

        //���Ԫ��
        arrays.add(s1);
        arrays.add(s2);
        arrays.add(s3);

        //����Ԫ��
        for(Iterator<Student> it=arrays.iterator();it.hasNext();){
            Student s=it.next();
            System.out.println(s.getName()+"---"+s.getAge());
        }
        System.out.println("------------------------");
        //��ǿfor��������
        for(Student s: arrays){
            System.out.println(s.getName()+"---"+s.getAge());
        }
    }
}
