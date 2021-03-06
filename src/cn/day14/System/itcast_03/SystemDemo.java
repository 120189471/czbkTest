package cn.day14.System.itcast_03;

import java.util.Arrays;

/**
 * Created by Searis on 2016/3/4.
 * System类包含一些有用的类字段和方法,他不能被实例化
 * <p>
 * 方法
 * public static void gc()             运行垃圾回收器
 * public static void exit(int status)  终止当前正在运行的 Java 虚拟机。参数用作状态码；根据惯例，非 0 的状态码表示异常终止
 * public static long currentTimeMillis()   返回以毫秒为单位的当前时间
 * public static arraycopy(Object src,int srcPos，object dest,int destPos,int length)
 *              从指定源数组中复制一个数组，复制从指定的位置开始，到目标数组的指定位置结束。
 *
 */
public class SystemDemo {
    public static void main(String[] args) {

        int[] arr={11,22,33,44,55};
        int[] arr2={6,7,8,9,10};

        System.arraycopy(arr,2,arr2,3,2);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

    }
}
