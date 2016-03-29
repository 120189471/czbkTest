package cn.day16.Generic.itcast_05;

/**
 * Created by Searis on 2016/3/23.
 */

//第一种情况，已知接口的类型
    /*
public class InterImpr implements Inter<String > {
    @Override
    public void show(String s) {
        System.out.println(s);
    }
}*/

//第二种情况，不知道泛型的类型
public class InterImpr<T> implements Inter<T> {
    @Override
    public void show(T t) {
        System.out.println(t);

    }
}


