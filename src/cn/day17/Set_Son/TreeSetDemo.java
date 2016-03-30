package cn.day17.Set_Son;

import java.util.TreeSet;

/**
 * Created by Searis on 2016/3/31.
 * TreeSet 能够对元素按照某种规则进行排序
 * A 自然数排序
 * B 比较器排序
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        //创建集合
        TreeSet<Integer> ts = new TreeSet<>();
        //添加集合元素
        ts.add(20);
        ts.add(18);
        ts.add(23);
        ts.add(22);
        ts.add(17);
        ts.add(24);
        ts.add(19);
        ts.add(18);
        ts.add(24);

        //遍历元素
        for (Integer i:ts){
            System.out.println(i);
        }


    }
}
