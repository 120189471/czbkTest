package cn.day14.Regex.itcast_01;

import java.util.Scanner;

/**
 * Created by Searis on 2016/3/3.
 *
 * �жϹ���
 *      String���͵�public boolean matches (String regex)
 *
 * ����
 *      �ж��ֻ������Ƿ�����Ҫ��
 */
public class RegexDemo2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("����������ֻ����룺");
        String regexPhoneNO=sc.nextLine();

        System.out.println("�Ƿ�����ֻ����򣺡�"+regexPhoneNO.matches("[1][358]\\d{9}"));


    }


}
