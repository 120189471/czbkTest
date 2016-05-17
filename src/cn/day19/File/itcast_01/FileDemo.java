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

        /*public boolean createNewFile():创建文件 如果存在这样的文件，就不创建了
         *public boolean mkdir():创建文件夹 如果存在这样的文件夹，就不创建了
         *public boolean mkdirs():创建文件夹,如果父文件夹不存在，会帮你创建出来
        */

        //File file4=new File("E:/java/demo/a.txt");
        //IOException: 系统找不到指定的路径
        File file4=new File("E:/java/a.txt");
        //System.out.println(file4.createNewFile());
        File file5=new File("E:/java/Demo/demo2");
        //System.out.println(file5.mkdirs());
        File file6=new File("E:/java/Demo/demo3/a.txt");
        //System.out.println(file6.mkdirs());
        System.out.println(file6.createNewFile());

        //删除功能:public boolean delete()
        System.out.println(file6.delete());
        File file7=new File("E:/java/Demo");
        System.out.println("file7: "+file7.delete());

        System.out.println("file4: "+file4.delete());






    }
}
