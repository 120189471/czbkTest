package cn.day19.Exception.itcast_01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Dix on 2016/5/17.
 */
public class ExceptionDemo2 {
    public static void main(String[] args) {
        System.out.println("aaa");
        try{
            methond();
        }catch (ParseException e){
            e.printStackTrace();
        }
        System.out.println("bbb");
        methond2();

    }

    public static void methond2()throws ArithmeticException{
        int a= 10;
        int b=0;
        System.out.println(a/b);
    }
    public static void methond()throws ParseException {
        String s="2014-11-20";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d=sdf.parse(s);
        System.out.println(d);

    }
}
