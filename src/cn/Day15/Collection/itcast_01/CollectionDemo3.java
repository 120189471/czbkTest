package cn.Day15.Collection.itcast_01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by Searis on 2016/3/14.
 * 写个学生集合并作迭代
 */
public class CollectionDemo3 {
    public static void main(String[] args) {
        //创建集合元素类

        Student s1 = new Student("唐僧", 20);
        Student s2 = new Student("孙悟空", 500);
        Student s3 = new Student("猪八戒", 1500);
        Student s4 = new Student("沙僧", 2000);
        //创建集合类
        Collection c=new ArrayList();
        c.add(s1);
        c.add(s2);
        c.add(s3);
        c.add(s4);

        //System.out.println(c);
        /*
        Object[] objs=c.toArray();

        for (int x=0;x<objs.length;x++){
            //System.out.println(objs[x]);
            Student s=(Student)objs[x];
            System.out.println(s.getName()+"---"+s.getAge());
        }
        */

        for(Iterator it=c.iterator();it.hasNext();){
            Student s=(Student) it.next();
            System.out.println(s.getName()+"---"+s.getAge());
        }

    }


}
