package otherTest.Test.folder;

import java.io.File;

public class Folders {

	public static void main(String args[]) {
		File dir = new File("data");
		File[] files = dir.listFiles();
		for (File file : files) {
			System.out.println(file.getAbsolutePath());
		}

	}

}
