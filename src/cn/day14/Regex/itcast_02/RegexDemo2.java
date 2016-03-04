package cn.day14.Regex.itcast_02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Searis on 2016/3/4.
 * 获取下面这个字符串中由三个字符组成的单词
 * da jia ting wo shuo,jin tian yao xia yu,bu shang wan zi xi,gao xing bu?
 * <p>
 * //把正则表达式编程成模式对象
 * Pattern p=Pattern.compile("a*b");
 * //通过模式对象得到匹配器对象，这个时候需要匹配器对象
 * Matcher m= p.matcher("aaaaab");
 * //调用匹配器对象的功能
 * boolean b=m.matches();
 */
public class RegexDemo2 {
    public static void main(String[] args) {
        //定义字符串
        String s = "da jia ting wo shuo,jin tian yao xia yu,bu shang wan zi xi,gao xing bu?";
        String regex = "\\b\\w{3}\\b";

        Pattern p= Pattern.compile(regex);
        Matcher m=p.matcher(s);
        /*
        boolean flag=m.find();
        System.out.println(flag);
        String s1=m.group();
        System.out.println(s1);
        //在来一次
        flag=m.find();
        s1=m.group();
        System.out.println(s1);
        */

        while (m.find()){
            System.out.println(m.group());

        }




    }
}

