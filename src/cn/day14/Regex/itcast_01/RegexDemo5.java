package cn.day14.Regex.itcast_01;

/**
 * Created by Searis on 2016/3/4.
 * <p>
 * �ָ����
 * �ָ������ַ�
 * aa,bb,cc
 * aaa.bbb.ccc
 * aa bb   cc  dd
 * ĳһϵͳ·��
 */
public class RegexDemo5 {
    public static void main(String[] args) {
        String s1 = "aa,bb,cc";
        String[] setArray = s1.split(",");
        for (int x=0;x<setArray.length;x++){
            System.out.println(setArray[x]);
        }
        System.out.println("---------------");
        String s2="aaa.bbb.ccc";

        String[] setArray2=s2.split("\\.");
        for (int x=0;x<setArray2.length;x++){
            System.out.println(setArray2[x]);
        }

        System.out.println("---------------");
        String s3="aa bb   cc   dd";
        String[] setArray3=s3.split(" +");
        for (int x=0;x<setArray3.length;x++){
            System.out.println(setArray3[x]);
        }

        System.out.println("---------------");
        String s4="D:\\java\\���ǲ���_2015��Java��������Ƶ������\\day14\\avi";
        String[] setArray4=s4.split("\\\\");
        for (int x=0;x<setArray4.length;x++){
            System.out.println(setArray4[x]);
        }

    }
}
