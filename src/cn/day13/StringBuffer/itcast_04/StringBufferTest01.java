package cn.day13.StringBuffer.itcast_04;

/**
 * Created by Searis on 2016/2/21.
 *
 * Sting和StringBuffer之间的相互转换
 */
public class StringBufferTest01 {
    public static void main(String[] args) {

        //String 和 Stringbuffer之间的相互转化

        StringBuffer sb=new StringBuffer("HelloWorldJava");

        //StringBuffer转换成 String
        //使用toString方法转换
        String str1 = sb.toString();
        //构造一个String方法
        String str2 =new String(sb);

        System.out.println("str1: "+str1);
        System.out.println("str2: "+str2);

        //String转换成StringBuffer
        //构造一个buffer方法
        StringBuffer buffer1= new StringBuffer(str1);
        //用appen的方法
        StringBuffer buffer2 =new StringBuffer();
        buffer2.append(str1);
        System.out.println("buffer1: "+buffer1);
        System.out.println("buffer2: "+buffer2);

    }
}
