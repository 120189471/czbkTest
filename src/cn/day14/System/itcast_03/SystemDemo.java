package cn.day14.System.itcast_03;

import java.util.Arrays;

/**
 * Created by Searis on 2016/3/4.
 * System�����һЩ���õ����ֶκͷ���,�����ܱ�ʵ����
 * <p>
 * ����
 * public static void gc()             ��������������
 * public static void exit(int status)  ��ֹ��ǰ�������е� Java ���������������״̬�룻���ݹ������� 0 ��״̬���ʾ�쳣��ֹ
 * public static long currentTimeMillis()   �����Ժ���Ϊ��λ�ĵ�ǰʱ��
 * public static arraycopy(Object src,int srcPos��object dest,int destPos,int length)
 *              ��ָ��Դ�����и���һ�����飬���ƴ�ָ����λ�ÿ�ʼ����Ŀ�������ָ��λ�ý�����
 *
 */
public class SystemDemo {
    public static void main(String[] args) {

        int[] arr={11,22,33,44,55};
        int[] arr2={6,7,8,9,10};

        System.arraycopy(arr,2,arr2,3,2);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

    }
}
