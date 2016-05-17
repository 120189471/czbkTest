package cn.day19.File.itcast_01;

import java.io.File;
import java.io.IOException;

/**
 * Created by Dix on 2016/5/17.
 */
public class FileDemo2 {
    public static void main(String args[]) throws IOException {
        File file1=new File("E:/java/Demo/rename.jpg");
        System.out.println("file1: "+file1.createNewFile());
    }
}
