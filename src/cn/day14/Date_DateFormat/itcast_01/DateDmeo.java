package cn.day14.Date_DateFormat.itcast_01;

import java.util.Date;

/**
 * Created by Searis on 2016/3/5.
 * Date b表示特定的瞬间，精确到毫秒
 * 构造方法
 * Date（） 根据当前的默认毫秒值创建日期对象
 * Date（long date） 更具给定的毫秒值创建日期对象
 *
 * 方法
 * public long getTime() 获取时间，以毫秒值为单位
 * public void setTime（设置一个毫秒值） 设置时间
 *
 * 从Date得到一个毫秒值
 *
 * long l= Date.getTime;
 *
 * 把一个毫秒值转换为Date
 *
 * 1.Date d=new Date(long l)
 * 2.Date d.setTime(long l)
 */
public class DateDmeo {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);

        //创建对象
        //long time =System.currentTimeMillis();
        long time = 1000 * 60 * 60;//1小时，我们对应东八区，所以时间为9点钟，理论初始时间因为格林威治时间
        Date d2 = new Date(time);
        System.out.println(d2);


    }
}
