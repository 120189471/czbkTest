package cn.day19.File.itcast_01;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Dix on 2016/5/18.
 *
 * 判断功能:
 * public boolean isDirectory():判断是否是目录
 * public boolean isFile():判断是否是文件
 * public boolean exists():判断是否存在
 * public boolean canRead():判断是否可读
 * public boolean canWrite():判断是否可写
 * public boolean isHidden():判断是否隐藏
 *
 * 获取功能：
 * public String getAbsolutePath()：获取绝对路径
 * public String getPath():获取相对路径
 * public String getName():获取名称
 * public long length():获取长度。字节数
 * public long lastModified():获取最后一次的修改时间，毫秒值
 *
 */
public class FileDemo3 {
    public static void main(String[] args) throws IOException {
        File file2=new File("e:/abc/efg/");
        File file1=new File("e:/abc/efg/hij.txt");
        File file3=new File("e:/abc/efg/hij2.txt");
        file2.mkdirs();
        try {
            System.out.println(file1.createNewFile());
        }catch(IOException i){
            System.out.println("目录不存在");
        }
        /*
        System.out.println("isDirectory: "+file2.isDirectory());
        System.out.println("isDirectory: "+file1.isDirectory());

        System.out.println("isFile: "+file2.isFile());
        System.out.println("isFile: "+file1.isFile());

        System.out.println("exists: "+file1.exists());
        System.out.println("exists: "+file3.exists());

        System.out.println("canRead: "+file1.canRead());
        System.out.println("canWrite: "+file1.canWrite());
        System.out.println("isHidden: "+file1.isHidden());
        */

        File file4=new File("new.txt");
        file4.createNewFile();
        System.out.println(file4.getAbsolutePath());
        System.out.println(file4.getPath());
        System.out.println(file4.getName());
        System.out.println(file4.length());

        //long lasttime=file4.lastModified();
        //Date d=new Date(lasttime);

        //Date d=new Date(file4.lastModified());

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("文件创建时间： "+sdf.format(new Date(file4.lastModified())));


        file4.delete();
    }
}
