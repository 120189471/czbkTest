package cn.day14.System.itcast_02;

/**
 * Created by Searis on 2016/3/4.
 *
 * System�����һЩ���õ����ֶκͷ���,�����ܱ�ʵ����
 * <p>
 * ����
 * public static void gc()             ��������������
 * public static void exit(int status)  ��ֹ��ǰ�������е� Java ���������������״̬�룻���ݹ������� 0 ��״̬���ʾ�쳣��ֹ
 * public static long currentTimeMillis()   �����Ժ���Ϊ��λ�ĵ�ǰʱ��
 * public static arraycopy(Object src,int srcPos��object dest,int destPos,int length)
 */
public class SystemDemo {
    public static void main(String[] args) {
        System.out.println("ϲ������ϼ");
        //System.exit(0);
        System.out.println("ϲ������֥");

        System.out.println(System.currentTimeMillis());
        //�����
        long time = System.currentTimeMillis() / 1000 / 60 / 60 / 24 / 365;
        System.out.println(time);

        long start = System.currentTimeMillis();
        for (int x = 0; x < 100000; x++) {
            int i=0;
            i+=x;
            System.out.println("���� hello" + x + "��");
        }
        long end = System.currentTimeMillis();
        System.out.println("��ִ��" + (end - start) + "����");


    }
}
