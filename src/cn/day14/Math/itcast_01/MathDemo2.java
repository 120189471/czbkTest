package cn.day14.Math.itcast_01;

import java.util.Scanner;

/**
 * Created by Searis on 2016/3/4.
 *
 * ����
 *  �����һ������������ʵ�ֻ�ȡ���ⷶΧ�ڵ������
 * ����
 *      1.����¼�룲������
 *          int start;
 *          int end;
 *      2.��취��ȡStart��end֮����������
 *      3.��������
 *
 */
public class MathDemo2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("�����뿪ʼ������");
        int x=sc.nextInt();
        System.out.println("���������������");
        int y=sc.nextInt();
        System.out.println(getRandom(x,y));


    }

    //��ȡ2����֮��������
    public static int getRandom(int x,int y){
        return (int)(Math.random() *(Math.abs(x-y))+1)+Math.min(x,y);
    }
}
