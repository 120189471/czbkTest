package cn.day13.Integer.itcast_01;

/**
 * Created by Searis on 2016/3/1.
 * JDK1.5������
 * �Զ�װ�䣺�ѻ�������ת���ɰ�װ����
 * �Զ����䣺�Ѱ�װ����ת���ɻ�������
 *
 * ע�⣬֮��ǰҪ��ȷ������Ϊ�գ�����ᱨ�� NullPointerException
 */
public class IntegerDemo3 {
    public static void main(String[] args) {
        //����һ��int���͵İ�װ����i
        //Integer i=new Integer(100);
        Integer i = 100;
        i += 200;
        System.out.println(i);

        /*
        //������class�ļ����
        Integer i = Integer.valueOf(100);   //�Զ�װ��
        i = Integer.valueOf(i.intValue() + 200);//���Զ����䣬���Զ�װ��
        System.out.println(i);
        */
        Integer ii=null;//NullPointerException ��ָ���쳣
        if (ii!=null){
            ii+=200;
        }


    }
}
