package cn.day14.Regex.itcast_01;

import java.util.Scanner;

/**
 * Created by Searis on 2016/3/3.
 * 校验qq号码
 * 1.要求必须5—15
 * 2.0不能开头
 */
public class RegexDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的QQ号：");
        String s = sc.nextLine();
        System.out.println("QQ校验结果：" + CheckQQ(s));
    }
/*
    public static boolean CheckQQ(String s) {
        boolean flag = true;
        char[] chr = s.toCharArray();

        //if (chr[0] != 0)
        if (!s.startsWith("0")) {
            if (chr.length <= 15 && chr.length >= 5) {
                for (int i = 0; i < chr.length - 1; i++) {
                    char ch = chr[i];
                    //if (ch >= '0' && ch <= '9')
                    if (!Character.isDigit(ch)){
                        break;
                    } else {
                        flag = false;
                    }
                }
            } else {
                flag = false;
            }
        } else {
            flag = false;
        }
        return flag;
    }
    */

    public static boolean CheckQQ(String s){
        /*
        String regex="[1-9][0-9]{4,14}";
        boolean flag=s.matches(regex);
        return flag;
        */
        return s.matches("[1-9][0-9]{4,14}");
    }
}

