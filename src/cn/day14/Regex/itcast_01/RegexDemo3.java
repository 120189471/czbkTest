package cn.day14.Regex.itcast_01;

import java.util.Scanner;

/**
 * Created by Searis on 2016/3/3.
 * 校验邮箱
 *
 */
public class RegexDemo3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你的邮箱：");
        String s=sc.nextLine();
        String Regexemail="[a-zA-Z0-9]+@[a-zA-Z0-9]{1,8}(\\.[a-zA-Z0-9]{2,3})+";
        System.out.println("邮箱是否符合规则："+s.matches(Regexemail));
    }
}
