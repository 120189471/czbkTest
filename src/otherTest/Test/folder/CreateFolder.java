package otherTest.Test.folder;

import java.io.File;

public class CreateFolder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dirs = "D:\\workspace\\demo\\a\\b\\c\\d";
		File file = new File(dirs);
		boolean result = file.mkdirs();
		if (result)
			System.out.println("Ŀ¼�����ɹ�");
		else
			System.out.println("Ŀ¼����ʧ��");
		System.out.println("�ϼ�Ŀ¼��" + file.getParent());
		// file.delete();
	}

}
