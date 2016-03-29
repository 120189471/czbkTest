package cn.day16.JDK5New.itcast_01;

import static java.lang.Math.abs;
/**
 * Created by Searis on 2016/3/24.
 */
public class StaticImportDemo {
    public static void main(String[] args) {
        //System.out.println(Math.abs(-10));
        //System.out.println(java.lang.Math.abs(-10));

        //æ≤Ã¨µº»Î
        //import static java.lang.Math.abs;
        System.out.println(abs(10));

    }

}
