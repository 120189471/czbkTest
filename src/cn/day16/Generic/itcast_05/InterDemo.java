package cn.day16.Generic.itcast_05;

/**
 * Created by Searis on 2016/3/23.
 */
public class InterDemo {
    public static void main(String[] args){
        //��һ�ַ�������֪����
//        Inter<String> i=new InterImpr();
//        i.show("Hello");
        //�ڶ��ַ�������֪������
        Inter<String> s=new InterImpr<String>();
        s.show("hello");
        Inter<Integer> i=new InterImpr<Integer>();
        i.show(100);
    }
}
