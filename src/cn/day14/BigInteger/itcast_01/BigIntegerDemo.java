package cn.day14.BigInteger.itcast_01;

import java.math.BigInteger;

/**
 * Created by Dix on 2016/3/5.
 * <p>
 * BigInteger:�����ó���Integer��Χ�ڵ����ݽ�������
 * <p>
 * ���췽��
 * BigInteger(String val)
 */
public class BigIntegerDemo {
    public static void main(String[] args) {
        Integer i = new Integer(100);
        System.out.println(Integer.MAX_VALUE);
        Integer ii = new Integer(2147483647);

        //Integer iii=new Integer(2147483648);

        BigInteger bi=new BigInteger("2147483648");
        System.out.println(bi);
    }
}
