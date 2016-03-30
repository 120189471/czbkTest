package cn.day17.Set_Son;

import java.util.HashSet;

/**
 * Created by Searis on 2016/3/30.
 */
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<String>();

        hs.add("Hello");
        hs.add("World");
        hs.add("Java");
        hs.add("World");

        System.out.println("Hello".hashCode());
        System.out.println("World".hashCode());
        System.out.println("Java".hashCode());

        for (String s:hs){
            System.out.println(s);
        }
    }
}
