package cn.day14.Regex.itcast_02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Searis on 2016/3/4.
 *
 * 获取功能
 *      Pattern和Matcher类的使用
 */
public class RegexDemo {
    public static void main(String[] args) {
        //模式和匹配器的调用功能
        //把正则表达式编程成模式对象
        Pattern p=Pattern.compile("a*b");
        //通过模式对象得到匹配器对象，这个时候需要匹配器对象
        Matcher m= p.matcher("aaaaab");
        //调用匹配器对象的功能
        boolean b=m.matches();
        System.out.println(b);
    }
}
