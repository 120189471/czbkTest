package cn.day14.Date_DateFormat.itcast_02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Searis on 2016/3/5.
 * <p>
 * Date -- String(格式化)
 * ）
 * <p>
 * DateFormat 可以进行日期和字符串的格式化和解析，但是由于抽象类，所以使用具体的子类，SimpleDateFormat
 * SimpleDateFormat() 的构造方法
 * SimpleDateFormat()
 * <p>
 * public SimpleDateFormat()    默认模式
 * public SimpleDateFormat(String pattern)  使用指定格式
 *
 * 模式的写法
 *      年   y
 *      月   M
 *      日   d
 *      时   H
 *      分   m
 *      秒   s
 * <p>
 * String -- Date（解析)
 *
 * public Date parse(String source)

 */
public class DateFormatDemo {
    public static void main(String[] args) throws ParseException {

        //Date -- String(格式化)
        //创建一个对象
        Date d = new Date();
        System.out.println(d);
        //创建格式化对象
        //默认模式
        SimpleDateFormat sdf = new SimpleDateFormat();
        String s = sdf.format(d);
        System.out.println(s);
        //给定模式
        SimpleDateFormat sdf2=new SimpleDateFormat("yyyy年 MM月 dd日 HH：mm：ss");
        String s2=sdf2.format(d);

        System.out.println(s2);

        //String -- Date（解析）
        String str="1986-12-23 15:03";
        SimpleDateFormat sdf3=new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date d2=sdf3.parse(str);
        System.out.println(d2);


    }
}
