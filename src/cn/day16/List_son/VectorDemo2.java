package cn.day16.List_son;

import java.util.Iterator;
import java.util.Vector;

/**
 * Created by Searis on 2016/3/22.
 * VectorDemo��ϰ ������ϰ
 */
public class VectorDemo2 {
    public static void main(String[] args) {
        //����Vector����
        Vector v = new Vector();

        //����Ԫ�ض���
        Student s1 = new Student("��֤��ָ", 399001);
        Student s2 = new Student("ƽ������", 000001);
        Student s3 = new Student("�ܳɽ�", 395099);

        //���Ԫ��
        v.add(s1);
        v.add(s2);
        v.add(s3);

        //����Ԫ��
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
