package cn.day16.JDK5New.itcast_01;

/**
 * Created by Searis on 2016/3/24.
 * <p>
 * �ɱ������ʽ
 */
public class ArgsDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int result = sum(a, b);
        System.out.println(result);


    }

    private static int sum(int b, int... a) {
        //�ɱ����������
        System.out.println(a);
        int result = 0;
        for (int x : a) {

            result += x;
        }
        return result;
    }


}
