package otherTest.Test.file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fw;
		BufferedWriter out;
		try {
			fw = new FileWriter("outputfile");
			out = new BufferedWriter(fw);
			out.write("今天天气真好!");
			out.close();
			System.out.println("文件写入成功");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("文件写入失败");
			e.printStackTrace();
		}

	}

}
