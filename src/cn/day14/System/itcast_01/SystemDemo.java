package cn.day14.System.itcast_01;

/**
 * Created by Searis on 2016/3/4.
 * System�����һЩ���õ����ֶκͷ���,�����ܱ�ʵ����
 *
 * ����
 *      public static void gc()             ��������������
 *      public static void exit(int status)
 *      public static long currentTimeMillis()
 *      public static arraycopy(Object src,int srcPos��object dest,int destPos,int length)
 *
 */
public class SystemDemo {
    public static void main(String[] args) {
        Person p=new Person("����֥",60);
        System.out.println(p);

        p=null;     //��p����ָ�����ڴ�
        System.gc();



    }
}
