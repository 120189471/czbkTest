package cn.day14.Regex.itcast_02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Searis on 2016/3/4.
 *
 * ��ȡ����
 *      Pattern��Matcher���ʹ��
 */
public class RegexDemo {
    public static void main(String[] args) {
        //ģʽ��ƥ�����ĵ��ù���
        //��������ʽ��̳�ģʽ����
        Pattern p=Pattern.compile("a*b");
        //ͨ��ģʽ����õ�ƥ�����������ʱ����Ҫƥ��������
        Matcher m= p.matcher("aaaaab");
        //����ƥ��������Ĺ���
        boolean b=m.matches();
        System.out.println(b);
    }
}
