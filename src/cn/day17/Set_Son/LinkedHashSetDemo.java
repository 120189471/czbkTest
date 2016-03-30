package cn.day17.Set_Son;

import java.util.LinkedHashSet;

/**
 * Created by Searis on 2016/3/31.
 * LinkedHashSet练习
 *
 * 具有可预知迭代顺序的 Set 接口的哈希表和链接列表实现
 * 哈希表保证数据唯一性
 * 链表保证元素有序（存储和取出一致）
 *
 */
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs=new LinkedHashSet<String>();

        lhs.add("world");
        lhs.add("Hello");
        lhs.add("java");
        for (String s:lhs){
            System.out.println(s);
        }
    }
}
