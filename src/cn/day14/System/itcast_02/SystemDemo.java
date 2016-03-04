package cn.day14.System.itcast_02;

/**
 * Created by Searis on 2016/3/4.
 *
 * System类包含一些有用的类字段和方法,他不能被实例化
 * <p>
 * 方法
 * public static void gc()             运行垃圾回收器
 * public static void exit(int status)  终止当前正在运行的 Java 虚拟机。参数用作状态码；根据惯例，非 0 的状态码表示异常终止
 * public static long currentTimeMillis()   返回以毫秒为单位的当前时间
 * public static arraycopy(Object src,int srcPos，object dest,int destPos,int length)
 */
public class SystemDemo {
    public static void main(String[] args) {
        System.out.println("喜欢林青霞");
        //System.exit(0);
        System.out.println("喜欢赵雅芝");

        System.out.println(System.currentTimeMillis());
        //获得年
        long time = System.currentTimeMillis() / 1000 / 60 / 60 / 24 / 365;
        System.out.println(time);

        long start = System.currentTimeMillis();
        for (int x = 0; x < 100000; x++) {
            int i=0;
            i+=x;
            System.out.println("输入 hello" + x + "次");
        }
        long end = System.currentTimeMillis();
        System.out.println("共执行" + (end - start) + "毫秒");


    }
}
