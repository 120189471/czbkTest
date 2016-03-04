package cn.day13.Array.itcast_01;

/**
 * Created by Searis on 2016/2/21.
 * <p>
 * √∞≈›≈≈–Ú∑®£∫bubbleSort()
 * <p>
 * —°‘Ò≈≈–Ú∑®£∫
 */
public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = {24, 69, 80, 57, 13, 70};
        System.out.println("≈≈–Ú«∞: " + arrToString(arr));

        System.out.println("√∞≈›∫Û: " + arrToString(bubbleSort(arr)));

        System.out.println("—°‘Ò∫Û: " + arrToString(selectSort(arr)));
    }

    //√∞≈›≈≈–Ú∑®
    public static int[] bubbleSort(int[] arr) {
        for (int y = arr.length - 1; y >= 0; y--) {
            for (int x = 0; x < y; x++) {
                if (arr[x] > arr[x + 1]) {
                    int mid = arr[x];
                    arr[x] = arr[x + 1];
                    arr[x + 1] = mid;
                }
            }
        }
        return arr;
    }

    //—°‘Ò≈≈–Ú∑®£∫
    public static int[] selectSort(int[] arr) {
        for (int x = 0; x < arr.length - 1; x++) {
            for (int y = x + 1; y < arr.length; y++)
                if (arr[x] > arr[y]) {
                    int mid = arr[y];
                    arr[y] = arr[x];
                    arr[x] = mid;
                }
        }
        return arr;
    }

    public static StringBuffer arrToString(int[] arr) {
        StringBuffer sb = new StringBuffer("[");
        for (int x = 0; x < arr.length; x++) {
            if (x == arr.length - 1) {
                sb.append(arr[x]).append("]");
            } else {
                sb.append(arr[x]).append(",");
            }
        }
        return sb;
    }
}
