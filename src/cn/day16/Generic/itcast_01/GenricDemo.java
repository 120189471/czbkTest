package cn.day16.Generic.itcast_01;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Searis on 2016/3/23.
 * <p>
 * ������ϰ
 */
public class GenricDemo {
    public static void main(String[] args) {
        //��������
        ArrayList<String> arrays = new ArrayList<String>();
        //���Ԫ��
        arrays.add("Hello");
        arrays.add("world");
        arrays.add("Java");

        Iterator<String> it = arrays.iterator();
        while (it.hasNext()){
            String s= it.next();
            System.out.println(s);
        }
    }
}
