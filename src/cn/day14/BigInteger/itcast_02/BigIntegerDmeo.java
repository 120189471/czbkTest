package cn.day14.BigInteger.itcast_02;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * Created by Dix on 2016/3/5.
 * <p>
 * BiInteger的方法
 * <p>
 * public BigInteger add (BigInteger val)       ：加
 * public BigInteger subtract(BigInteger val)   ：减
 * public BigInteger multiply(BigInteger val)   ：乘
 * public BigInteger divide(BigInteger val)     ：除
 * public Biginteger divideAndRemainder(BigInteger val ) 返回商和余数的数组
 *          返回包含 (this / val) 后跟 (this % val) 的两个 BigInteger 的数组。
 */
public class BigIntegerDmeo {
    public static void main(String[] args) {
        BigInteger bi1 = new BigInteger("50");
        BigInteger bi2 = new BigInteger("30");
        BigInteger bi3 = bi1.add(bi2);
        BigInteger bi4 = bi1.subtract(bi2);
        BigInteger bi5 = bi1.multiply(bi2);
        BigInteger bi6 = bi1.divide(bi2);
        System.out.println("bi3: " + bi3);
        System.out.println("bi4: " + bi4);
        System.out.println("bi5: " + bi5);
        System.out.println("bi6: " + bi6);

        BigInteger[] bi7=bi1.divideAndRemainder(bi2);
        System.out.println(Arrays.toString(bi7));
    }
}
