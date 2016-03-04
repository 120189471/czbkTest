package cn.day13.Array.itcast_03;

import java.util.Arrays;

/**
 * Created by Searis on 2016/3/1.
 * <p>
 * Arrays：针对数组进行操作的工具类。比如查找和排序
 * <p>
 * 1。public static String toString(int[] a) :把数组转换成字符串
 * 2。public static void sort (int[] a):对数组进行排序
 * 3。public static int binarySearch(int[] a,int key) :二分查找
 */
public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr = {24, 69, 80, 57, 13, 99};

        //把数组转换成字符串
        String s = arr.toString();
        String s2 = Arrays.toString(arr);

        System.out.println("arr: " + s);
        System.out.println("arr: " + s2);

        Arrays.sort(arr);
        System.out.println("arr排序后：" + Arrays.toString(arr));

        System.out.println("arr二分查找：" + Arrays.binarySearch(arr, 999));
    }
/*
    public static int binarySearch(int[] a, int key) {
        return binarySearch0(a, 0, a.length, key);
    }

    private static int binarySearch0(int[] a, int fromIndex, int toIndex,
                                     int key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = a[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -(low + 1);  // key not found.
    }
   */
}
