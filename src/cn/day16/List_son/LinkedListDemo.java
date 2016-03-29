package cn.day16.List_son;

import java.util.LinkedList;
import java.util.Iterator;


/**
 * Created by Searis on 2016/3/22.
 * <p>
 * LinkedList��ϰ
 */
public class LinkedListDemo {

    public static void main(String[] args) {
        //����LinkedList���󼯺�
        LinkedList<String> link = new LinkedList<String>();

        //���Ӽ���Ԫ��
        link.add("Hello");
        link.add("World");
        link.add("Java");

        //��������
        Iterator<String> it = link.iterator();
        while (it.hasNext()) {
            String s = (String) it.next();
            System.out.println(s);
        }

        System.out.println("--------------------");
        for (int x = 0; x < link.size(); x++) {
            String s = (String) link.get(x);
            System.out.println(s);
        }

        System.out.println("--------------------");
        for (String s : link) {
            System.out.println(s);
        }
    }
}
