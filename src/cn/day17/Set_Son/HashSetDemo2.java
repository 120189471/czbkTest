package cn.day17.Set_Son;

import java.util.HashSet;

/**
 * Created by Searis on 2016/3/30.
 */
public class HashSetDemo2 {
    public static void main(String[] args) {
        //创建集合
        HashSet<Student> hs = new HashSet<Student>();
        //创建元素对象
        Student s1 = new Student("huangfeihong", 18);
        Student s2 = new Student("huangfeihong", 19);
        Student s3 = new Student("lingqingxia", 27);
        Student s4 = new Student("mengtingwei", 25);
        Student s5 = new Student("xiaofengxian", 18);
        Student s6 = new Student("huangfeihong", 18);

        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);
        hs.add(s5);
        hs.add(s6);

        for (Student s:hs){
            System.out.println(s.getName()+"---"+s.getAge());
        }
    }
}
