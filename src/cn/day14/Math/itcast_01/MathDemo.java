package cn.day14.Math.itcast_01;

/**
 * Created by Searis on 2016/3/4.
 * Math 用于数学计算
 * 成员变量
 * public static final double PI
 * public static final Deble E
 * 成员方法
 * public static int abs(int a)        绝对值
 * public static double ceil（double a）     向上取整
 * public static double floor(double a)        向下取整
 * public static int max(int a,int b)      最大值
 * public static int min(int a,int b)      最小值
 * public static double pow(double a,double b) a的b次幂
 * public static souble random()       随机数
 * public static int round (float a)   四舍五入（参数也可谓double）
 * public static double sqrt(double a) 正平方根
 */
public class MathDemo {
    public static void main(String[] args) {
        //public static final double PI
        System.out.println(Math.PI);
        //public static final Deble E
        System.out.println(Math.E);
        System.out.println("----------------------");

        //public static int abs(int a)        绝对值
        System.out.println(Math.abs(-199));
        System.out.println(Math.abs(299));
        System.out.println("----------------------");

        // public static double ceil（double a）     向上取整
        System.out.println(Math.ceil(3.14));
        System.out.println(Math.ceil(3.54));
        System.out.println("----------------------");

        // public static double floor(double a)        向下取整
        System.out.println(Math.floor(3.14));
        System.out.println(Math.floor(3.54));
        System.out.println("----------------------");

        // public static int max(int a,int b)      最大值
        System.out.println(Math.max(3.1516, 3.2526));
        System.out.println(Math.max(999999998, 999999999));
        System.out.println(Math.max(1, 1));
        //三个值取最值
        System.out.println(Math.max(Math.max(15, 23), 17));
        System.out.println("---------最小值-------------");

        // public static int min(int a,int b)      最小值
        System.out.println(Math.min(3.1516, 3.2526));
        System.out.println(Math.min(999999998, 999999999));
        System.out.println(Math.min(1, 1));
        System.out.println("----------------------");

        // public static double pow(double a,double b) a的b次幂
        System.out.println(Math.pow(2, 2));
        System.out.println(Math.pow(3, 0));
        System.out.println(Math.pow(0, 4));
        System.out.println(Math.pow(2.2, 4));
        System.out.println("----------------------");

        // public static souble random()       随机数 范围（0.0~1.0）
        System.out.println(Math.random() * 10);
        System.out.println("----------------------");

        // public static int round (float a)   四舍五入（参数也可谓double）
        System.out.println(Math.round(3.14f));
        System.out.println(Math.round(3.55f));
        System.out.println("----------------------");

        // public static double sqrt(double a) 正平方根
        System.out.println(Math.sqrt(9));
        System.out.println(Math.sqrt(4));
        System.out.println(Math.sqrt(5));


    }
}
