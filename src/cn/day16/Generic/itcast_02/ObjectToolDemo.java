package cn.day16.Generic.itcast_02;

/**
 * Created by Searis on 2016/3/23.
 * Object �����������ݣ����ǲ���ȫ�����Ժ������뷺��
 */
public class ObjectToolDemo {
    public static void main(String[] args){
        //����ʹ��
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
