package cn.day14.Math.itcast_01;

/**
 * Created by Searis on 2016/3/4.
 * Math ������ѧ����
 * ��Ա����
 * public static final double PI
 * public static final Deble E
 * ��Ա����
 * public static int abs(int a)        ����ֵ
 * public static double ceil��double a��     ����ȡ��
 * public static double floor(double a)        ����ȡ��
 * public static int max(int a,int b)      ���ֵ
 * public static int min(int a,int b)      ��Сֵ
 * public static double pow(double a,double b) a��b����
 * public static souble random()       �����
 * public static int round (float a)   �������루����Ҳ��νdouble��
 * public static double sqrt(double a) ��ƽ����
 */
public class MathDemo {
    public static void main(String[] args) {
        //public static final double PI
        System.out.println(Math.PI);
        //public static final Deble E
        System.out.println(Math.E);
        System.out.println("----------------------");

        //public static int abs(int a)        ����ֵ
        System.out.println(Math.abs(-199));
        System.out.println(Math.abs(299));
        System.out.println("----------------------");

        // public static double ceil��double a��     ����ȡ��
        System.out.println(Math.ceil(3.14));
        System.out.println(Math.ceil(3.54));
        System.out.println("----------------------");

        // public static double floor(double a)        ����ȡ��
        System.out.println(Math.floor(3.14));
        System.out.println(Math.floor(3.54));
        System.out.println("----------------------");

        // public static int max(int a,int b)      ���ֵ
        System.out.println(Math.max(3.1516, 3.2526));
        System.out.println(Math.max(999999998, 999999999));
        System.out.println(Math.max(1, 1));
        //����ֵȡ��ֵ
        System.out.println(Math.max(Math.max(15, 23), 17));
        System.out.println("---------��Сֵ-------------");

        // public static int min(int a,int b)      ��Сֵ
        System.out.println(Math.min(3.1516, 3.2526));
        System.out.println(Math.min(999999998, 999999999));
        System.out.println(Math.min(1, 1));
        System.out.println("----------------------");

        // public static double pow(double a,double b) a��b����
        System.out.println(Math.pow(2, 2));
        System.out.println(Math.pow(3, 0));
        System.out.println(Math.pow(0, 4));
        System.out.println(Math.pow(2.2, 4));
        System.out.println("----------------------");

        // public static souble random()       ����� ��Χ��0.0~1.0��
        System.out.println(Math.random() * 10);
        System.out.println("----------------------");

        // public static int round (float a)   �������루����Ҳ��νdouble��
        System.out.println(Math.round(3.14f));
        System.out.println(Math.round(3.55f));
        System.out.println("----------------------");

        // public static double sqrt(double a) ��ƽ����
        System.out.println(Math.sqrt(9));
        System.out.println(Math.sqrt(4));
        System.out.println(Math.sqrt(5));


    }
}
