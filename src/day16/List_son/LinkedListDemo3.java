package day16.List_son;

import java.util.LinkedList;

/**
 * Created by Searis on 2016/3/22.
 * <p>
 * LinkedList���й���
 * ��ӹ���
 * public void addFirst(E e)
 * public void addLast(E e)
 * ��ȡ����
 * public E getFirst()
 * public E getLast()
 * <p>
 * ɾ������
 * public E removeFirst()
 * public E removeLast()
 */
public class LinkedListDemo3 {
    public static void main(String[] args) {
        LinkedList link=new LinkedList();

        link.addFirst("Hello");
        link.addFirst("World");
        link.addFirst("Java");

        System.out.println("---------");
        String s1=(String) link.getFirst();
        String s2=(String) link.getFirst();
        String s3=(String) link.getLast();

        System.out.println(s1+"---"+s2+"---"+s3);

        System.out.println("---------");
        System.out.println(link.removeFirst());//�Ƴ���һ�������ص�һ��
        System.out.println(link.removeLast());

        System.out.println("---------");
        System.out.println(link);
    }
}
