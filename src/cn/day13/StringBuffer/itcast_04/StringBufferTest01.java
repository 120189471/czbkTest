package cn.day13.StringBuffer.itcast_04;

/**
 * Created by Searis on 2016/2/21.
 *
 * Sting��StringBuffer֮����໥ת��
 */
public class StringBufferTest01 {
    public static void main(String[] args) {

        //String �� Stringbuffer֮����໥ת��

        StringBuffer sb=new StringBuffer("HelloWorldJava");

        //StringBufferת���� String
        //ʹ��toString����ת��
        String str1 = sb.toString();
        //����һ��String����
        String str2 =new String(sb);

        System.out.println("str1: "+str1);
        System.out.println("str2: "+str2);

        //Stringת����StringBuffer
        //����һ��buffer����
        StringBuffer buffer1= new StringBuffer(str1);
        //��appen�ķ���
        StringBuffer buffer2 =new StringBuffer();
        buffer2.append(str1);
        System.out.println("buffer1: "+buffer1);
        System.out.println("buffer2: "+buffer2);

    }
}
