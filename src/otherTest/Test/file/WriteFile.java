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
			out.write("�����������!");
			out.close();
			System.out.println("�ļ�д��ɹ�");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("�ļ�д��ʧ��");
			e.printStackTrace();
		}

	}

}
