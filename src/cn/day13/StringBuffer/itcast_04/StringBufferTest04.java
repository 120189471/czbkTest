package cn.day13.StringBuffer.itcast_04;



import java.util.Scanner;

/**
 * Created by Searis on 2016/2/21.
 * <p>
 * �ж�һ���ַ����Ƿ�Ϊ�ԳƵ��ַ���
 * <p>
 * ע�� ==��ʾ���ǱȽ��ַ�����
 */
public class StringBufferTest04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������һ���ַ�����");
        String s1 = sc.nextLine();
        String s2 = new StringBuffer(s1).reverse().toString();
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);

        if (s1.equals(s2)) {
            System.out.println("�����ַ����Գ�");
        } else {
            System.out.println("�����ַ������Գ�");
        }
        System.out.println("�ȽϽ���� " + s1.equals(s2));

        System.out.println("�ȽϽ�����ַ����飩" + isSame(s1));

        System.out.println("�ȽϽ����Stringbuffer��"+isSame2(s1));
    }

    //��һ����������Stringbuffer

    public static boolean isSame2(String s){
        return new StringBuffer(s).reverse().toString().equals(s);
    }

    //�ڶ�������,��String�Ƚ�����
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
