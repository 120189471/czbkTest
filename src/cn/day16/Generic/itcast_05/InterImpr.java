package cn.day16.Generic.itcast_05;

/**
 * Created by Searis on 2016/3/23.
 */

//��һ���������֪�ӿڵ�����
    /*
public class InterImpr implements Inter<String > {
    @Override
    public void show(String s) {
        System.out.println(s);
    }
}*/

//�ڶ����������֪�����͵�����
public class InterImpr<T> implements Inter<T> {
    @Override
    public void show(T t) {
        System.out.println(t);

    }
}


