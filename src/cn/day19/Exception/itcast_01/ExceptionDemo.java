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
            System.out.println("��������Ϊ0");
        }
        try {
            System.out.println(arr[3]);
        }

        catch(ArrayIndexOutOfBoundsException aiobe){
            System.out.println("����Խ��");
        }catch (Exception e){
            System.out.println("�쳣��ƽ̨������");
        }
    }
}
