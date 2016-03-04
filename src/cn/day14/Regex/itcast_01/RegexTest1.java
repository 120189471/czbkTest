package cn.day14.Regex.itcast_01;

import java.util.Arrays;

/**
 * Created by Searis on 2016/3/3.
 * 字符串"91，27，46，38，50"
 * 输出字符串”27，38，46，50，91“
 *
 * 分析：
 *  1。分割出字符数组
 *  2。把字符数组转换成数字数组并进行排序
 *      2.1
 *  3。将排序后的数字数组转换成字符数组并输出
 *
 */
public class RegexTest1 {
    public static void main(String[] args) {
        String s ="91，27，46，38，50";
        String[] setArray=s.split("，");

        int[] intArray=new int[setArray.length];

        for (int x=0;x<setArray.length;x++){
            intArray[x]=Integer.parseInt(setArray[x]);
        }
        Arrays.sort(intArray);
        StringBuilder sb=new StringBuilder();
        for (int x=0;x<intArray.length;x++){
            System.out.println(intArray[x]);

            sb.append(intArray[x]).append(" ");
        }
        String result=sb.toString().trim();
        System.out.println(result);





    }
}
