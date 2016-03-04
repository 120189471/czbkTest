package cn.day14.Regex.itcast_01;


import java.util.Scanner;

/**
 * Created by Searis on 2016/3/3.
 * 分割功能
 * String类的public String[] split(String regex)
 * <p>
 * 举例 获取年龄在 18-25 岁之间的人
 */
public class RegexDemo4 {
    public static void main(String[] args) {
        String age = "18-25";
        String regex = "-";
        String[] setArray = age.split(regex);

        for (int i = 0; i < setArray.length; i++) {
            System.out.println(setArray[i]);
        }
        int startAge = Integer.parseInt(setArray[0]);
        int endAge = Integer.parseInt(setArray[1]);

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你需要的年龄");
        int needAge = sc.nextInt();

        if (needAge >= startAge && needAge <= endAge) {
            System.out.println("你的年龄符合要求");

        } else {
            System.out.println("你的年龄不符合要求，谢谢！");
        }

    }


}
