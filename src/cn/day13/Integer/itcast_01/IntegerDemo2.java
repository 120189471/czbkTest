package cn.day13.Integer.itcast_01;

/**
 * Created by Searis on 2016/3/1.
 * <p>
 * int 与String的相互准换
 * int--String
 * 方法有四种，建议用ValueOF
 * <p>
 * String---int
 * 建议使用方法：Integer.parseInt(no);
 */
public class IntegerDemo2 {
    public static void main(String[] args) {
        int x = 100;
        //方式一
        String s = "" + x;
        //方式二
        String s2 = String.valueOf(x);
        //方式三
        Integer i1 = new Integer(x);
        String s3 = i1.toString();
        //方式四
        String s4 = Integer.toString(x);
        System.out.println("s : " + s + "\n" + "s2: " + s2 + "\n" + "s3: " + s3 + "\n" + "s4: " + s4);

        String no = "100";
        //方式一
        //String --- Integer --- int
        Integer i2 = new Integer(no);
        int s5 = i2.intValue();
        System.out.println("s5: " + s5);
        //方式二
        int s6 = Integer.parseInt(no);
        System.out.println("s6: " + s6);


    }
}
