package cn.day14.Date_DateFormat.itcast_01;

import java.util.Date;

/**
 * Created by Searis on 2016/3/5.
 * Date b��ʾ�ض���˲�䣬��ȷ������
 * ���췽��
 * Date���� ���ݵ�ǰ��Ĭ�Ϻ���ֵ�������ڶ���
 * Date��long date�� ���߸����ĺ���ֵ�������ڶ���
 *
 * ����
 * public long getTime() ��ȡʱ�䣬�Ժ���ֵΪ��λ
 * public void setTime������һ������ֵ�� ����ʱ��
 *
 * ��Date�õ�һ������ֵ
 *
 * long l= Date.getTime;
 *
 * ��һ������ֵת��ΪDate
 *
 * 1.Date d=new Date(long l)
 * 2.Date d.setTime(long l)
 */
public class DateDmeo {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);

        //��������
        //long time =System.currentTimeMillis();
        long time = 1000 * 60 * 60;//1Сʱ�����Ƕ�Ӧ������������ʱ��Ϊ9���ӣ����۳�ʼʱ����Ϊ��������ʱ��
        Date d2 = new Date(time);
        System.out.println(d2);


    }
}
