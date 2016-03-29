package cn.day16.List_son;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Searis on 2016/3/21.
 *
 * 取出集合中的重复元素
 *
 */
public class ArraryListDemo {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();
        arrayList.add("Hello");
        arrayList.add("world");
        arrayList.add("java");
        arrayList.add("world");
        arrayList.add("java");
        arrayList.add("java");
        arrayList.add("world");
        arrayList.add("Hello");
        arrayList.add("java");
        arrayList.add("world");

        System.out.println(arrayList);

        ArrayList newArrayList=new ArrayList();

        for (Iterator it=arrayList.iterator();it.hasNext();){
            String s=(String)it.next();
            if (!newArrayList.contains(s)){
                newArrayList.add(s);
            }
        }

/*
        //这个有问题
        for (int x = 0; x <= arrayList.size(); x++) {
            for (int y = x + 1; y < arrayList.size() - 1; y++) {
                if (arrayList.get(x).equals(arrayList.get(y))) {
                    arrayList.remove(y);


                }
            }
        }
*/

        System.out.println(arrayList);
    }



}
