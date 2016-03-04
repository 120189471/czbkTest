package cn.day13.StringBuffer.itcast_03;

/**
 * Created by Searis on 2016/2/18.
 * <p>
 * StingBuffer ��ɾ������
 * public StringBuffer delteCharAt(int index)  :ɾ��ָ��λ�õ��ַ��������ر���
 * public StringBuffer delte(int start, int end)   :ɾ��ָ����ʼλ��ָ������λ�õ����ݣ������ر��� (���󲻰���]
 * <p>
 * StingBuffer ���滻����
 * pubic StringBuffer replace (int start,int end, String str)   :��start��ʼ��end������str�滻
 * <p>
 * StringBuffer �ķ�ת����
 * public StringBuffer reverse();
 * <p>
 * StringBuffer �Ľ�ȡ����
 * public String substring(int start);  ע�ⷵ��ֵ��String����
 * public String substring(int start,int end);
 *
 * Sting��StringBuffer֮����໥ת��
 *
 * Sting StringBuffer StringBuild������
 * a    String���ݺͳ��ȶ�����
 *      String���ֶ�
 *
 *��ʽ
 *
 *
 */
public class StringBuffetDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello").append("World").append("Java");

        System.out.println("sb: " + sb);
/*
        sb.deleteCharAt(10);
        System.out.println("sb: "+sb);
*/

        sb.delete(5, 10);
        System.out.println("sb: " + sb);

        sb.delete(0, sb.length());
        System.out.println("sb: " + sb);

        //�� world �滻�� �����տ��֡�
        sb.append("Hello").append("World").append("Java");

        sb.replace(5, 10, "+���տ���+");
        System.out.println("sb: " + sb);

        sb.reverse();
        System.out.println("sb�� " + sb);
        sb.reverse();
        System.out.println("sb: " + sb);

        String s1 = sb.substring(6);
        String s2 = sb.substring(6, 10);

        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println("sb: " + sb);

        //String �� Stringbuffer֮����໥ת��
        //ʹ��toString����ת��
        String str1 = sb.toString();
        //����һ��String����
        String str2 =new String(sb);

        System.out.println("str1: "+str1);
        System.out.println("str2: "+str2);

        //����һ��buffer����
        StringBuffer buffer1= new StringBuffer(str1);
        //��appen�ķ���
        StringBuffer buffer2 =new StringBuffer();
        buffer2.append(str1);
        System.out.println("buffer1: "+buffer1);
        System.out.println("buffer2: "+buffer2);




    }
}
