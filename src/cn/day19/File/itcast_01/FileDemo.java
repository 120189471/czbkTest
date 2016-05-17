package cn.day19.File.itcast_01;

import java.io.File;
import java.io.IOException;

/**
 * Created by Dix on 2016/4/29.
 */
public class FileDemo{
    public static void main(String[] args)throws IOException{

        File file1 = new File("E:/java/demo/a.txt");
        System.out.println(file1);

        File file2 = new File("E:/java/demo", "a.txt");
        System.out.println(file2);

        File file3 = new File(file1, "a.txt");
        System.out.println(file3);

        /*public boolean createNewFile():�����ļ� ��������������ļ����Ͳ�������
         *public boolean mkdir():�����ļ��� ��������������ļ��У��Ͳ�������
         *public boolean mkdirs():�����ļ���,������ļ��в����ڣ�����㴴������
        */

        //File file4=new File("E:/java/demo/a.txt");
        //IOException: ϵͳ�Ҳ���ָ����·��
        File file4=new File("E:/java/a.txt");
        //System.out.println(file4.createNewFile());
        File file5=new File("E:/java/Demo/demo2");
        //System.out.println(file5.mkdirs());
        File file6=new File("E:/java/Demo/demo3/a.txt");
        //System.out.println(file6.mkdirs());
        System.out.println(file6.createNewFile());

        //ɾ������:public boolean delete()
        System.out.println(file6.delete());
        File file7=new File("E:/java/Demo");
        System.out.println("file7: "+file7.delete());

        System.out.println("file4: "+file4.delete());






    }
}
