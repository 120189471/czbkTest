package cn.day16.Generic.itcast_05;

/**
 * Created by Searis on 2016/3/23.
 */
public class InterDemo {
    public static void main(String[] args){
        //第一种方法，已知类型
//        Inter<String> i=new InterImpr();
//        i.show("Hello");
        //第二种方法，不知道类型
        Inter<String> s=new InterImpr<String>();
        s.show("hello");
        Inter<Integer> i=new InterImpr<Integer>();
        i.show(100);
    }
}
