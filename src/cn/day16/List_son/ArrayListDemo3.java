package cn.day16.List_son;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Searis on 2016/3/22.
 * ArrrayList��ϰ
 *  ȥ���ظ�����
 */
public class ArrayListDemo3 {
    public static void main(String[] args) {
        //��������
        ArrayList arrays=new ArrayList();

        //��������
        Student s1=new Student("�ַ�����",600000);
        Student s2=new Student("50ETF",510050);
        Student s3=new Student("��ָ֤��1",000001);
        Student s4=new Student("��ָ֤��2",000001);
        Student s5=new Student("��ָ֤��",000001);
        Student s6=new Student("��ָ֤��",000001);
        Student s7=new Student("��ָ֤��",000001);

        //���Ԫ��
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
