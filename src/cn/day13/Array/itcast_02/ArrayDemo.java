package cn.day13.Array.itcast_02;

/**
 * Created by Dix on 2016/3/1.
 * ����:  ��ͨ����
 * ���ַ�����(�۰����)
 *
 * �����ύ
 */
public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr={11,22,33,55,77,99,111};
        int no=getIndex(121,arr);
        System.out.println("index; " +no);
        if (no==-1){
            System.out.println("����������ֲ���������");
        }else {
            System.out.println("index; " +no);
        }

    }

    public static int getIndex(int value, int[] arr) {
        int index = -1;
        int min = 0;
        int max = arr.length - 1;

        while (min <= max) {

            int mid = (min + max) / 2;

            if (value > arr[mid]) {
                min = mid + 1;
            } else if (value < arr[mid]) {
                max = mid - 1;
            } else if (value == arr[mid]) {
                index = mid;
                break;
            }
        }

        return index;
    }
}
