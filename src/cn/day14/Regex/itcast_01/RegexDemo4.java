package cn.day14.Regex.itcast_01;


import java.util.Scanner;

/**
 * Created by Searis on 2016/3/3.
 * �ָ��
 * String���public String[] split(String regex)
 * <p>
 * ���� ��ȡ������ 18-25 ��֮�����
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
        System.out.println("����������Ҫ������");
        int needAge = sc.nextInt();

        if (needAge >= startAge && needAge <= endAge) {
            System.out.println("����������Ҫ��");

        } else {
            System.out.println("������䲻����Ҫ��лл��");
        }

    }


}
