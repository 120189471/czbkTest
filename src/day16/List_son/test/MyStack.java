package day16.List_son.test;

import java.util.LinkedList;


/**
 * Created by Searis on 2016/3/21.
 */
public class MyStack {
    private LinkedList link;

    public MyStack(){
        link =new LinkedList();
    }

    public void add(String s){
        link.addFirst(s);
    }
    public Object get(){
        //return link.getFirst();
        return link.removeFirst();
    }

    public int size(){
        return link.size();
    }

    public boolean isEmpty(){
        return link.isEmpty();
    }

}
