package cn.day14.Regex.itcast_02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Searis on 2016/3/4.
 * ��ȡ��������ַ������������ַ���ɵĵ���
 * da jia ting wo shuo,jin tian yao xia yu,bu shang wan zi xi,gao xing bu?
 * <p>
 * //��������ʽ��̳�ģʽ����
 * Pattern p=Pattern.compile("a*b");
 * //ͨ��ģʽ����õ�ƥ�����������ʱ����Ҫƥ��������
 * Matcher m= p.matcher("aaaaab");
 * //����ƥ��������Ĺ���
 * boolean b=m.matches();
 */
public class RegexDemo2 {
    public static void main(String[] args) {
        //�����ַ���
        String s = "da jia ting wo shuo,jin tian yao xia yu,bu shang wan zi xi,gao xing bu?";
        String regex = "\\b\\w{3}\\b";

        Pattern p= Pattern.compile(regex);
        Matcher m=p.matcher(s);
        /*
        boolean flag=m.find();
        System.out.println(flag);
        String s1=m.group();
        System.out.println(s1);
        //����һ��
        flag=m.find();
        s1=m.group();
        System.out.println(s1);
        */

        while (m.find()){
            System.out.println(m.group());

        }




    }
}

