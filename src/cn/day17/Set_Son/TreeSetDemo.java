package cn.day17.Set_Son;

import java.util.TreeSet;

/**
 * Created by Searis on 2016/3/31.
 * TreeSet �ܹ���Ԫ�ذ���ĳ�ֹ����������
 * A ��Ȼ������
 * B �Ƚ�������
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        //��������
        TreeSet<Integer> ts = new TreeSet<>();
        //��Ӽ���Ԫ��
        ts.add(20);
        ts.add(18);
        ts.add(23);
        ts.add(22);
        ts.add(17);
        ts.add(24);
        ts.add(19);
        ts.add(18);
        ts.add(24);

        //����Ԫ��
        for (Integer i:ts){
            System.out.println(i);
        }


    }
}
