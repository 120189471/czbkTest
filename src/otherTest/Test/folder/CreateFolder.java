package otherTest.Test.folder;

import java.io.File;

public class CreateFolder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dirs = "D:\\workspace\\demo\\a\\b\\c\\d";
		File file = new File(dirs);
		boolean result = file.mkdirs();
		if (result)
			System.out.println("目录创建成功");
		else
			System.out.println("目录创建失败");
		System.out.println("上级目录是" + file.getParent());
		// file.delete();
	}

}
