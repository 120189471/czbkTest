package cn.day14.BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by Searis on 2016/3/5.
 * <p>
 * BigDecimal方法
 * <p>
 * 构造方法
 * public  BigDecimal(String val)
 * <p>
 * public BigDecimal add(BigDecimal augend)
 * public BigDecimal subtract(BigDecimal subtrahend)
 * public BigDecimal multiply(BigDecimal multiplicand)
 * public BigDecimal divide(BigDecimal divisor)
 * public BigDecimal divide(BigDecimal divisor,int Scale,int roundingmode) 商几位，保留几位，如何取舍
 */
public class BigDecimalDemo2 {
    public static void main(String[] args) {
//        System.out.println(0.09+0.01);
//        System.out.println(1.0-0.32);
//        System.out.println(1.015*100);
//        System.out.println(1.301/100);

        BigDecimal bd1 = new BigDecimal("0.09");
        BigDecimal bd2 = new BigDecimal("0.01");
        System.out.println(bd1.add(bd2));

        BigDecimal bd3 = new BigDecimal("1.0");
        BigDecimal bd4 = new BigDecimal("0.32");
        System.out.println(bd3.subtract(bd4));

        BigDecimal bd5 = new BigDecimal("1.0150");
        BigDecimal bd6 = new BigDecimal("100");
        System.out.println(bd5.multiply(bd6));

        BigDecimal bd7 = new BigDecimal("1.301");
        BigDecimal bd8 = new BigDecimal("100");
        System.out.println(bd7.divide(bd8));

        System.out.println(bd7.divide(bd8,9, RoundingMode.DOWN));

    }
}
