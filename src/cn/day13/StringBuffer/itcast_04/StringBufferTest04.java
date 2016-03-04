package cn.day13.StringBuffer.itcast_04;



import java.util.Scanner;

/**
 * Created by Searis on 2016/2/21.
 * <p>
 * 判断一个字符串是否为对称的字符串
 * <p>
 * 注意 ==表示的是比较字符串的
 */
public class StringBufferTest04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s1 = sc.nextLine();
        String s2 = new StringBuffer(s1).reverse().toString();
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);

        if (s1.equals(s2)) {
            System.out.println("输入字符串对称");
        } else {
            System.out.println("输入字符串不对称");
        }
        System.out.println("比较结果： " + s1.equals(s2));

        System.out.println("比较结果（字符数组）" + isSame(s1));

        System.out.println("比较结果（Stringbuffer）"+isSame2(s1));
    }

    //第一种做法，用Stringbuffer

    public static boolean isSame2(String s){
        return new StringBuffer(s).reverse().toString().equals(s);
    }

    //第二种做法,用String比较做法
    public static boolean isSame(String s) {
        char[] chs = s.toCharArray();
        boolean flag = true;
        for (int start = 0, end = chs.length - 1; start <= end; start++, end--) {
            if (chs[start] != chs[end]) {
                flag = false;
                break;
            }

        }
        return flag;

        /*boolean flag=false;
        for (int start = 0; start <= chr.length-1; start++) {
            if (chr[start] == chr[chr.length - start]) {
                flag = true;
                break;
            }
        }
        return flag;*/
    }
}
