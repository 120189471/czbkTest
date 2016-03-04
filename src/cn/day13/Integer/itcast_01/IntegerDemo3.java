package cn.day13.Integer.itcast_01;

/**
 * Created by Searis on 2016/3/1.
 * JDK1.5新特性
 * 自动装箱：把基本类型转换成包装类型
 * 自动拆箱：把包装类型转换成基本类型
 *
 * 注意，之行前要先确定对象不为空，否则会报错 NullPointerException
 */
public class IntegerDemo3 {
    public static void main(String[] args) {
        //定义一个int类型的包装类型i
        //Integer i=new Integer(100);
        Integer i = 100;
        i += 200;
        System.out.println(i);

        /*
        //反编译class文件结果
        Integer i = Integer.valueOf(100);   //自动装箱
        i = Integer.valueOf(i.intValue() + 200);//先自动拆箱，在自动装箱
        System.out.println(i);
        */
        Integer ii=null;//NullPointerException 空指针异常
        if (ii!=null){
            ii+=200;
        }


    }
}
