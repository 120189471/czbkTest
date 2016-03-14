package cn.day14.BigDecimal;

/**
 * Created by Searis on 2016/3/5.
 * 看程序写结果
 *  结果和我们预想的不一样，这是因为float类型的数据存储和整数不一样导致的
 *  由于运算时，float和double很容易丢失精度，所以，javva在计算时提供了BigDecimal
 *
 *  BigDeimal
 *  可以解决数据丢失问题，不可变的
 */
public class BigDecimalDemo {
    public static void main(String[] args) {
        System.out.println(0.09+0.01);
        System.out.println(1.0-0.32);
        System.out.println(1.015*100);
        System.out.println(1.301/100);

        System.out.println(1.0-0.12);

    }
}
