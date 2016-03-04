package cn.day13.StringBuffer.itcast_03;

/**
 * Created by Searis on 2016/2/18.
 * <p>
 * StingBuffer 的删除功能
 * public StringBuffer delteCharAt(int index)  :删除指定位置的字符，并返回本身
 * public StringBuffer delte(int start, int end)   :删除指定开始位置指定结束位置的内容，并返回本身 (包左不包右]
 * <p>
 * StingBuffer 的替换功能
 * pubic StringBuffer replace (int start,int end, String str)   :从start开始到end结束用str替换
 * <p>
 * StringBuffer 的反转功能
 * public StringBuffer reverse();
 * <p>
 * StringBuffer 的截取功能
 * public String substring(int start);  注意返回值是String类型
 * public String substring(int start,int end);
 *
 * Sting和StringBuffer之间的相互转换
 *
 * Sting StringBuffer StringBuild的区别；
 * a    String内容和长度都不变
 *      String部分额
 *
 *形式
 *
 *
 */
public class StringBuffetDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello").append("World").append("Java");

        System.out.println("sb: " + sb);
/*
        sb.deleteCharAt(10);
        System.out.println("sb: "+sb);
*/

        sb.delete(5, 10);
        System.out.println("sb: " + sb);

        sb.delete(0, sb.length());
        System.out.println("sb: " + sb);

        //将 world 替换成 “节日快乐”
        sb.append("Hello").append("World").append("Java");

        sb.replace(5, 10, "+节日快乐+");
        System.out.println("sb: " + sb);

        sb.reverse();
        System.out.println("sb： " + sb);
        sb.reverse();
        System.out.println("sb: " + sb);

        String s1 = sb.substring(6);
        String s2 = sb.substring(6, 10);

        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println("sb: " + sb);

        //String 和 Stringbuffer之间的相互转化
        //使用toString方法转换
        String str1 = sb.toString();
        //构造一个String方法
        String str2 =new String(sb);

        System.out.println("str1: "+str1);
        System.out.println("str2: "+str2);

        //构造一个buffer方法
        StringBuffer buffer1= new StringBuffer(str1);
        //用appen的方法
        StringBuffer buffer2 =new StringBuffer();
        buffer2.append(str1);
        System.out.println("buffer1: "+buffer1);
        System.out.println("buffer2: "+buffer2);




    }
}
