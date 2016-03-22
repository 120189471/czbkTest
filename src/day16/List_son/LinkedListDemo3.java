package day16.List_son;

import java.util.LinkedList;

/**
 * Created by Searis on 2016/3/22.
 * <p>
 * LinkedList特有功能
 * 添加功能
 * public void addFirst(E e)
 * public void addLast(E e)
 * 获取功能
 * public E getFirst()
 * public E getLast()
 * <p>
 * 删除功能
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
        System.out.println(link.removeFirst());//移除第一个并返回第一个
        System.out.println(link.removeLast());

        System.out.println("---------");
        System.out.println(link);
    }
}
