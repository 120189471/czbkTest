package cn.day19.File.itcast_01;

import java.io.File;

/**
 * Created by Dix on 2016/5/18.
 * 判断E盘目录下是否有后缀名为.jpg的文件，如果有，就输出此文件名称
 * a.封装E盘java目录为对象
 * b.列出java目录数组
 * c.判断每个元素后缀
 *      如果相同，则显示该名称
 *
 *
 */
public class FileDemo5 {
    public static void main(String[] args) {
        File file1=new File("E:/java");
        /*File[] filesarr=file1.listFiles();
        int i=0;
        for (File f:filesarr){
            if (f.isFile()&&f.getName().endsWith(".txt")){
                System.out.println(f.getPath());
                i=i+1;
            }
        }
        System.out.println("总共 "+i+" 个bmp后缀文件");
    }*/
        File[] fileArr=file1.listFil


}
