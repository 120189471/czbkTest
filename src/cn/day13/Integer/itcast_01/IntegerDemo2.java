package cn.day13.Integer.itcast_01;

/**
 * Created by Searis on 2016/3/1.
 * <p>
 * int ��String���໥׼��
 * int--String
 * ���������֣�������ValueOF
 * <p>
 * String---int
 * ����ʹ�÷�����Integer.parseInt(no);
 */
public class IntegerDemo2 {
    public static void main(String[] args) {
        int x = 100;
        //��ʽһ
        String s = "" + x;
        //��ʽ��
        String s2 = String.valueOf(x);
        //��ʽ��
        Integer i1 = new Integer(x);
        String s3 = i1.toString();
        //��ʽ��
        String s4 = Integer.toString(x);
        System.out.println("s : " + s + "\n" + "s2: " + s2 + "\n" + "s3: " + s3 + "\n" + "s4: " + s4);

        String no = "100";
        //��ʽһ
        //String --- Integer --- int
        Integer i2 = new Integer(no);
        int s5 = i2.intValue();
        System.out.println("s5: " + s5);
        //��ʽ��
        int s6 = Integer.parseInt(no);
        System.out.println("s6: " + s6);


    }
}
