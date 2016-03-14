package cn.Day15.Collection.itcast_01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by Searis on 2016/3/13.
 * <p>
 * Collection的功能
 * 1。添加功能
 * boolean add (Object obj)    添加一个元素
 * boolean addAll(Collection c)    添加一个集合的元素
 * 2.删除功能
 * void clear()    一移除所有元素
 * boolean ramove(Object o)    移除一个元素
 * boolean removeAll(Collectionc)  移除一个集合的元素
 * <p>
 * 3. 判断功能
 * boolean contains(Object o)  判断集合中是否包含指定的元素
 * boolean containsAll(Collection c)   判断集合中是否包含指定的集合元素
 * boolean isEmpty()   判断集合是否为空
 * 4.获取功能(重点)
 * Iterator <E> iterator()
 * 5.长度功能
 * int size（）  元素的个数
 * 6.交集功能
 * boolean retainAll(Coolection c) 两个集合独有的元素
 * 7.把集合转换成数组
 * Object[] toArray（）
 */
public class CollectionDemo {
    public static void main(String[] args) {
        //创建集合对象
        //Collection ce=new Collection();
        Collection c = new ArrayList();
        System.out.println("c: " + c);
        //创建元素对象
        c.add("Hello");
        c.add("World");
        c.add("java");
        System.out.println("c: " + c);

        //c.remove("World");
        //System.out.println("c: " + c);
        /*
        c.remove("world");
        System.out.println("c: " + c);
        */
        //c.clear();
        System.out.println(c.isEmpty());

        System.out.println("c: " + c);
        System.out.println(c.contains("hello"));
        System.out.println(c.contains("Hello"));

        System.out.println(c.size());
        System.out.println("----------");
        /*
        Iterator it=c.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        */
        //死循环
       for (Iterator it=c.iterator();it.hasNext();){

           System.out.println(it.next());
        }

        //NoSuchElementException
        //System.out.println(it.next());
        // for循环改写
//         for(Iterator it = c.iterator();it.hasNext();){
//         Student s = (Student) it.next();
//         System.out.println(s.getName() + "---" + s.getAge());
//         }
    }
}
