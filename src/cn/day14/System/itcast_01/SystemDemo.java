package cn.day14.System.itcast_01;

/**
 * Created by Searis on 2016/3/4.
 * System类包含一些有用的类字段和方法,他不能被实例化
 *
 * 方法
 *      public static void gc()             运行垃圾回收器
 *      public static void exit(int status)
 *      public static long currentTimeMillis()
 *      public static arraycopy(Object src,int srcPos，object dest,int destPos,int length)
 *
 */
public class SystemDemo {
    public static void main(String[] args) {
        Person p=new Person("赵雅芝",60);
        System.out.println(p);

        p=null;     //让p不在指定堆内存
        System.gc();



    }
}
