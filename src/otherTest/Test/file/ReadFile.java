package otherTest.Test.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr;
		BufferedReader in;
		try {
			fr = new FileReader("D:\\workspace\\demo\\data\\outputfile");
			in = new BufferedReader(fr);
			String str;
			while ((str = in.readLine()) != null) {
				System.out.println(str);
			}
			System.out.println("文件读取成功");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("文件读取失败");
			e.printStackTrace();
		}
	}

}
