package cn.day14.Regex.itcast_01;

import java.util.Scanner;

/**
 * Created by Searis on 2016/3/3.
 *
 * 判断功能
 *      String类型的public boolean matches (String regex)
 *
 * 需求：
 *      判断手机号码是否满足要求
 */
public class RegexDemo2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你的手机号码：");
        String regexPhoneNO=sc.nextLine();

        System.out.println("是否符合手机规则：　"+regexPhoneNO.matches("[1][358]\\d{9}"));


    }


}
