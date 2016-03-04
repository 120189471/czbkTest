package cn.day13.Integer.itcast_01;

/**
 * Created by Searis on 2016/3/1.
 * ����1�� Ҫ�а�ʮ����100 ��ɶ����ƣ��˽��ƣ�ʮ������
 * ����2�� Ҫ���ж�һ�������Ƿ���int��Χ��
 * ����Ҫ�˽�int�ķ�Χ
 * Ϊ�˶��������ͽ��и��࣬������Ĳ�����Java�����ÿһ�ֻ������������ṩ�˶�Ӧ���� ���ͣ���װ������ ���ڻ�������֮���ת��
 * byte        Byte
 * short       Short
 * int         Integer
 * long        Long
 * float       Float
 * double      Double
 * char        Character
 * boolean     Boolean
 *
 * Integer�Ĺ��췽��
 *
 * public Integer(int value)
 * public Integer(String s)
 *
 * ʮ����ת������������
 * �����ƣ�public static String toBinaryString(int i);
 * �˽��ƣ�public static String toOctalString(int i);
 * ʮ�����ƣ�public static String toHexString(int i);
 * ת������������
 * public static String toString(int i,int radix)
 * radix ��Χ 2-26 ȡ0-9��a-z;
 *
 * �������Ƶ�������
 *
 * public static Integer parseInt(String s,int radix);
 * s��ֵ������radix������ʾ���Ʒ�Χ�ڣ����򱨴�NumberFormatException
 *
 */
public class IntegerDemo {
    public static void main(String[] args) {
        int x = 100;
        //public static String toBinaryString(int i)
        System.out.println(Integer.toBinaryString(100));
        //public static String toOctalString(int i)
        System.out.println(Integer.toOctalString(100));
        //public static String toHexString(int i)
        System.out.println(Integer.toHexString(100));

        //public static final int MAX_VALUE
        int max = Integer.MAX_VALUE;
        //public static final int MIN_VALUE
        int min = Integer.MIN_VALUE;
        System.out.println("max: " + max);
        System.out.println("min: " + min);

        long l1 = Integer.MAX_VALUE + 1;
        long l2 = Integer.MIN_VALUE - 1;

        //int x1=Integer.MAX_VALUE+2;  //��ֵԽ��

        System.out.println("---------------");
        Integer i1= new Integer(x);
        System.out.println(i1.toString());
        String s1="100";

        Integer i2=new Integer(s1);
        System.out.println(i2);
        /*
        //NumberFormatExceptio
        String s2="e";
        Integer i3=new Integer(s2);
        */
        System.out.println("\n---------------");
        System.out.println("�������Ƶ�ʮ����");
        System.out.println(Integer.parseInt("133",10));
        System.out.println(Integer.parseInt("133",2));


    }
}
