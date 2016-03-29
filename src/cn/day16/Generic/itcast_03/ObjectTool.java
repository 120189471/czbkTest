package cn.day16.Generic.itcast_03;

/**
 * Created by Searis on 2016/3/23.
 * 泛型类：将泛型定义在类上
 */
public class ObjectTool<T> {
    private T obj;
    public T getObj(){
        return obj;
    }

    public void setObj(T obj){
        this.obj=obj;

    }

    public void show(T t){
        System.out.println(t);
    }
}
