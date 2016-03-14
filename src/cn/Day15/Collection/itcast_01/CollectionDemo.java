package cn.Day15.Collection.itcast_01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by Searis on 2016/3/13.
 * <p>
 * Collection�Ĺ���
 * 1����ӹ���
 * boolean add (Object obj)    ���һ��Ԫ��
 * boolean addAll(Collection c)    ���һ�����ϵ�Ԫ��
 * 2.ɾ������
 * void clear()    һ�Ƴ�����Ԫ��
 * boolean ramove(Object o)    �Ƴ�һ��Ԫ��
 * boolean removeAll(Collectionc)  �Ƴ�һ�����ϵ�Ԫ��
 * <p>
 * 3. �жϹ���
 * boolean contains(Object o)  �жϼ������Ƿ����ָ����Ԫ��
 * boolean containsAll(Collection c)   �жϼ������Ƿ����ָ���ļ���Ԫ��
 * boolean isEmpty()   �жϼ����Ƿ�Ϊ��
 * 4.��ȡ����(�ص�)
 * Iterator <E> iterator()
 * 5.���ȹ���
 * int size����  Ԫ�صĸ���
 * 6.��������
 * boolean retainAll(Coolection c) �������϶��е�Ԫ��
 * 7.�Ѽ���ת��������
 * Object[] toArray����
 */
public class CollectionDemo {
    public static void main(String[] args) {
        //�������϶���
        //Collection ce=new Collection();
        Collection c = new ArrayList();
        System.out.println("c: " + c);
        //����Ԫ�ض���
        c.add("Hello");
        c.add("World");
        c.add("java");
        System.out.println("c: " + c);

        //c.remove("World");
        //System.out.println("c: " + c);
        /*
        c.remove("world");
        System.out.println("c: " + c);
        */
        //c.clear();
        System.out.println(c.isEmpty());

        System.out.println("c: " + c);
        System.out.println(c.contains("hello"));
        System.out.println(c.contains("Hello"));

        System.out.println(c.size());
        System.out.println("----------");
        /*
        Iterator it=c.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        */
        //��ѭ��
       for (Iterator it=c.iterator();it.hasNext();){

           System.out.println(it.next());
        }

        //NoSuchElementException
        //System.out.println(it.next());
        // forѭ����д
//         for(Iterator it = c.iterator();it.hasNext();){
//         Student s = (Student) it.next();
//         System.out.println(s.getName() + "---" + s.getAge());
//         }
    }
}
