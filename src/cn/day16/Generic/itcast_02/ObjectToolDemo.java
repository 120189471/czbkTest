package cn.day16.Generic.itcast_02;

/**
 * Created by Searis on 2016/3/23.
 * Object 代表任意数据，但是不安全，所以后期引入泛型
 */
public class ObjectToolDemo {
    public static void main(String[] args){
        //正常使用
        ObjectTool ot=new ObjectTool();

        ot.setObj(new Integer(30));
        Integer i=(Integer) ot.getObj();
        System.out.println(i);

        ot.setObj(new String("sun"));
        String s=(String)ot.getObj();
        System.out.println(s);

        ot.setObj(new String("moon"));
        //ClassCastException
        Integer i2=(Integer)ot.getObj();
        System.out.println(i2);
    }
}
