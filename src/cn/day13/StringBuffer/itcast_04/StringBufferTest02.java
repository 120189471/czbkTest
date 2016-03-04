package cn.day13.StringBuffer.itcast_04;

/**
 * Created by Searis on 2016/2/21.
 */
public class StringBufferTest02 {
    public static void main(String[] args) {
        int[] arr = {44, 33, 55, 11, 99, 22, 88};
        System.out.println("s:"+arrToString(arr));

        System.out.println("s:"+arrToString2(arr));

    }

    public static String arrToString2(int[] arr) {
        StringBuffer s = new StringBuffer();
        s.append("[");
        for (int x = 0; x < arr.length; x++) {
            if (x == arr.length - 1) {
                s.append(arr[x]).append("]");
            } else {
                s.append(arr[x]).append(", ");
            }
        }
        return s.toString();
    }

    public static String arrToString(int[] arr) {
        //将数组合并成String
        String s = "";
        s += "[";
        for (int x = 0; x < arr.length; x++) {
            if (x == arr.length - 1) {
                s += arr[x];

            } else {
                s += arr[x];
                s += ", ";
            }
        }
        s += "]";

        return s;

    }
}
