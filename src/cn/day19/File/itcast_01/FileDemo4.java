package cn.day19.File.itcast_01;

import java.io.File;

/**
 * Created by Dix on 2016/5/18.
 * <p>
 * ��ȡ���ܣ�
 * public String[] list():��ȡָ��Ŀ¼�µ������ļ������ļ��е���������
 * public File[] listFiles():��ȡָ��Ŀ¼�µ������ļ������ļ��е�File����
 */
public class FileDemo4 {
    public static void main(String[] args) {
        File file1 = new File("E:/java");
        String[] arr = file1.list();

        for (String s : arr) {
            System.out.println(s);
        }

        System.out.println("------------");
        File[] arr2 = file1.listFiles();
        for (File f : arr2) {
            System.out.println(f.getPath());
        }


    }
}
