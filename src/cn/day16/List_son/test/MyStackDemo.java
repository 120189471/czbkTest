package cn.day16.List_son.test;

/**
 * Created by Searis on 2016/3/22.
 */
public class MyStackDemo {
    public static void main(String[] args) {
        MyStack my=new MyStack();
        my.add("Hello");
        my.add("World");
        my.add("Java");

        while (!my.isEmpty()){
            System.out.println(my.get());
        }

    }
}
