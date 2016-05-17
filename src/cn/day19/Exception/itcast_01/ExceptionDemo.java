package cn.day19.Exception.itcast_01;

/**
 * Created by Dix on 2016/5/17.
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        int[] arr={1,2,3};

        try {
            System.out.println(a / b);

        }catch(ArithmeticException ae){
            System.out.println("除数不能为0");
        }
        try {
            System.out.println(arr[3]);
        }

        catch(ArrayIndexOutOfBoundsException aiobe){
            System.out.println("数组越界");
        }catch (Exception e){
            System.out.println("异常，平台出问题");
        }
    }
}
