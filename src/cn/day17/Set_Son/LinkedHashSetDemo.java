package cn.day17.Set_Son;

import java.util.LinkedHashSet;

/**
 * Created by Searis on 2016/3/31.
 * LinkedHashSet��ϰ
 *
 * ���п�Ԥ֪����˳��� Set �ӿڵĹ�ϣ��������б�ʵ��
 * ��ϣ��֤����Ψһ��
 * ����֤Ԫ�����򣨴洢��ȡ��һ�£�
 *
 */
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs=new LinkedHashSet<String>();

        lhs.add("world");
        lhs.add("Hello");
        lhs.add("java");
        for (String s:lhs){
            System.out.println(s);
        }
    }
}
