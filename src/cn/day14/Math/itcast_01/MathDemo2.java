package cn.day14.Math.itcast_01;

import java.util.Scanner;

/**
 * Created by Searis on 2016/3/4.
 *
 * 需求：
 *  请设计一个方法，可以实现获取任意范围内的随机数
 * 分析
 *      1.键盘录入２个数据
 *          int start;
 *          int end;
 *      2.想办法获取Start到end之间的随机数；
 *      3.输出这个数
 *
 */
public class MathDemo2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入开始的数字");
        int x=sc.nextInt();
        System.out.println("请输入结束的数字");
        int y=sc.nextInt();
        System.out.println(getRandom(x,y));


    }

    //获取2个数之间的随机数
    public static int getRandom(int x,int y){
        return (int)(Math.random() *(Math.abs(x-y))+1)+Math.min(x,y);
    }
}
