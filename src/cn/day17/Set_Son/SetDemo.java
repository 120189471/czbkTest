package cn.day17.Set_Son;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Searis on 2016/3/30.
 */
public class SetDemo {
    public static void main(String[] args) {
        //创建集合对象
        Set<String> set = new HashSet<String>();

        //添加集合元素
        set.add("Hello");
        set.add("World");
        set.add("Java");
        set.add("World");
        set.add("Java");

        //遍历集合
        System.out.println(set);

        //set.forEach(System.out::println);
        //can be replaced with foreach call,
        // this inspection reports foreach loops which can be replaced with stream api calls,String api is not available under java 1.7 or earlier jvms
        for (String s:set){
            System.out.println(s);
        }

    }
}
