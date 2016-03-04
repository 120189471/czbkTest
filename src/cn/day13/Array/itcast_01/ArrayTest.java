package cn.day13.Array.itcast_01;


/**
 * Created by Searis on 2016/2/21.
 * °Ñ×Ö·û´®½øÐÐÅÅÐò
 */
public class ArrayTest {
    public static void main(String[] args) {
        String s = "dacgexbf";
        System.out.println("ÅÅÐòÇ°£º " + s);
        System.out.println("ÅÅÐòºó£º " + stringSort(s));
    }

    public static String stringSort(String s) {
        char[] chs = s.toCharArray();

        return String.valueOf(selectSort(chs));
    }

    public static char[] selectSort(char[] arr) {
        for (int x = 0; x < arr.length - 1; x++) {
            for (int y = x + 1; y < arr.length; y++)
                if (arr[x] > arr[y]) {
                    char mid = arr[y];
                    arr[y] = arr[x];
                    arr[x] = mid;
                }
        }
        return arr;
    }

    public static String charToString(char[] chs) {
        /*
        StringBuffer sb = new StringBuffer();
        for (int x = 0; x < chs.length; x++) {
            sb.append(chs[x]);
        }
        return sb.toString();
        */

        String s="";
        for (int x=0;x<chs.length;x++){
            s+=chs[x];
        }
        return s;
    }


}
