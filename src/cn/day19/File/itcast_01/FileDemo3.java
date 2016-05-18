package cn.day19.File.itcast_01;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Dix on 2016/5/18.
 *
 * �жϹ���:
 * public boolean isDirectory():�ж��Ƿ���Ŀ¼
 * public boolean isFile():�ж��Ƿ����ļ�
 * public boolean exists():�ж��Ƿ����
 * public boolean canRead():�ж��Ƿ�ɶ�
 * public boolean canWrite():�ж��Ƿ��д
 * public boolean isHidden():�ж��Ƿ�����
 *
 * ��ȡ���ܣ�
 * public String getAbsolutePath()����ȡ����·��
 * public String getPath():��ȡ���·��
 * public String getName():��ȡ����
 * public long length():��ȡ���ȡ��ֽ���
 * public long lastModified():��ȡ���һ�ε��޸�ʱ�䣬����ֵ
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
            System.out.println("Ŀ¼������");
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
        System.out.println("�ļ�����ʱ�䣺 "+sdf.format(new Date(file4.lastModified())));


        file4.delete();
    }
}
