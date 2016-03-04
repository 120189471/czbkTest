package otherTest.Test.file;

import java.io.File;
import java.io.IOException;

public class FileExists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("D:\\workspace\\demo\\outputfile1");
		if (file.exists()) {
			System.out.println("文件找到了");
		} else {
			System.out.println("文件没找到，尝试创建此文件" + file.getName());
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
//		System.out.println(System.getProperty("user.dir"));
	}
}
