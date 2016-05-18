package cn.day14.Date_DateFormat.itcast_02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Searis on 2016/3/5.
 * <p>
 * Date -- String(��ʽ��)
 * ��
 * <p>
 * DateFormat ���Խ������ں��ַ����ĸ�ʽ���ͽ������������ڳ����࣬����ʹ�þ�������࣬SimpleDateFormat
 * SimpleDateFormat() �Ĺ��췽��
 * SimpleDateFormat()
 * <p>
 * public SimpleDateFormat()    Ĭ��ģʽ
 * public SimpleDateFormat(String pattern)  ʹ��ָ����ʽ
 *
 * ģʽ��д��
 *      ��   y
 *      ��   M
 *      ��   d
 *      ʱ   H
 *      ��   m
 *      ��   s
 * <p>
 * String -- Date������)
 *
 * public Date parse(String source)

 */
public class DateFormatDemo {
    public static void main(String[] args) throws ParseException {

        //Date -- String(��ʽ��)
        //����һ������
        Date d = new Date();
        System.out.println(d);
        //������ʽ������
        //Ĭ��ģʽ
        SimpleDateFormat sdf = new SimpleDateFormat();
        String s = sdf.format(d);
        System.out.println(s);
        //����ģʽ
        SimpleDateFormat sdf2=new SimpleDateFormat("yyyy�� MM�� dd�� HH��mm��ss");
        String s2=sdf2.format(d);

        System.out.println(s2);

        //String -- Date��������
        String str="1986-12-23 15:03";
        SimpleDateFormat sdf3=new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date d2=sdf3.parse(str);
        System.out.println(d2);


    }
}
