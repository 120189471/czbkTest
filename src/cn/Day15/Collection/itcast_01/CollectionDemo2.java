package cn.Day15.Collection.itcast_01;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Searis on 2016/3/14.
 *
 * Collection���ܣ�
 *
 * boolean addAll(Collection c):���һ�����ϵ�Ԫ��
 * boolean removeAll(Collection c):�Ƴ�һ�����ϵ�Ԫ��(��һ����������)
 * boolean containsAll(Collection c)���жϼ������Ƿ����ָ���ļ���Ԫ��(��һ����������)
 * boolean retainAll(Collection c):�������϶��е�Ԫ��?˼��Ԫ��ȥ���ˣ����ص�boolean����ʲô��˼��?
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

        //ֻҪ��һ������Ӿͷ���TRUE
        //System.out.println(c1.addAll(c2));

        /*
        //ֻҪ��һ�����Ƴ��ͷ���true
        System.out.println(c1.removeAll(c2));
        */
        //���б���������ʾTRUE��������ʾfalse
        //System.out.println(c1.containsAll(c2));

        //A��B��������������ص�A�У�B���ֲ���
        //��������ʾA�Ƿ����仯
        //A����ǿռ������ΪFalse
        //B����ǿռ������ΪTrue
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
