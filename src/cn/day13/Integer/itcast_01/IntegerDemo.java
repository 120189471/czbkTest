package cn.day13.Integer.itcast_01;

/**
 * Created by Searis on 2016/3/1.
 * 需求1： 要有把十进制100 变成二进制，八进制，十六进制
 * 需求2： 要求判断一个数据是否在int范围内
 * 首先要了解int的范围
 * 为了对数据类型进行更多，更方便的操作，Java就针对每一种基本数据类型提供了对应的类 类型，包装类类型 用于基本类型之间的转换
 * byte        Byte
 * short       Short
 * int         Integer
 * long        Long
 * float       Float
 * double      Double
 * char        Character
 * boolean     Boolean
 *
 * Integer的构造方法
 *
 * public Integer(int value)
 * public Integer(String s)
 *
 * 十进制转换成其他进制
 * 二进制：public static String toBinaryString(int i);
 * 八进制：public static String toOctalString(int i);
 * 十六进制：public static String toHexString(int i);
 * 转换成其他进制
 * public static String toString(int i,int radix)
 * radix 范围 2-26 取0-9，a-z;
 *
 * 其他进制到树进制
 *
 * public static Integer parseInt(String s,int radix);
 * s的值必须在radix基数表示机制范围内，否则报错NumberFormatException
 *
 */
public class IntegerDemo {
    public static void main(String[] args) {
        int x = 100;
        //public static String toBinaryString(int i)
        System.out.println(Integer.toBinaryString(100));
        //public static String toOctalString(int i)
        System.out.println(Integer.toOctalString(100));
        //public static String toHexString(int i)
        System.out.println(Integer.toHexString(100));

        //public static final int MAX_VALUE
        int max = Integer.MAX_VALUE;
        //public static final int MIN_VALUE
        int min = Integer.MIN_VALUE;
        System.out.println("max: " + max);
        System.out.println("min: " + min);

        long l1 = Integer.MAX_VALUE + 1;
        long l2 = Integer.MIN_VALUE - 1;

        //int x1=Integer.MAX_VALUE+2;  //数值越界

        System.out.println("---------------");
        Integer i1= new Integer(x);
        System.out.println(i1.toString());
        String s1="100";

        Integer i2=new Integer(s1);
        System.out.println(i2);
        /*
        //NumberFormatExceptio
        String s2="e";
        Integer i3=new Integer(s2);
        */
        System.out.println("\n---------------");
        System.out.println("其他进制到十进制");
        System.out.println(Integer.parseInt("133",10));
        System.out.println(Integer.parseInt("133",2));


    }
}
