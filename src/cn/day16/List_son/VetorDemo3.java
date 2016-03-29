package cn.day16.List_son;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by Searis on 2016/3/22.
 * Vector特有功能
 * 添加功能
 * public void addElement(E obj)
 * 获取功能
 * public E elementAt(int index)
 * public Enumeration<E> elements()
 * <p>
 * boolean hasMoreElements()
 * E nextElement()
 */
public class VetorDemo3 {
    public static void main(String[] args) {
        Vector v = new Vector();

        v.addElement("Hello");
        v.addElement("World");
        v.addElement("Java");

        for (int x = 0; x < v.size(); x++) {
            String s = (String) v.elementAt(x);
            System.out.println(s);
        }

        System.out.println(v.elements());

        Enumeration e = v.elements();
        while (e.hasMoreElements()) {
            String s = (String) e.nextElement();
            System.out.println(s);
        }
    }
}
