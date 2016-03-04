package cn.day13.StringBuffer.itcast_04;

import java.util.Scanner;

/**
 * Created by Searis on 2016/2/21.
 *
 * 把字符串反转
 */
public class StringBufferTest03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入字符串： ");
        String s=sc.nextLine();

        //方式一： 用String做反转

        System.out.println("字符串反转："+myReverse(s));


        //方式二： 用StringBuffer做反转

        System.out.println("字符串反转（StringBuffer）： "+myReverse2(s));

    }

    public static String myReverse2(String s){
/*
        StringBuffer sb=new StringBuffer(s);
        return sb.reverse().toString();
 */
        return new StringBuffer(s).reverse().toString();
        }

    public static String myReverse(String s){
        String result="";

        char[] chr=s.toCharArray();
        for (int x=chr.length-1;x>=0;x--){
            result+=chr[x];
        }
        return result;
    }
}
