package otherTest.Test.array;

public class Break {

	public static void main(String args[]) {
		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

		int find = 6;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == find) {
				System.out.println("�ҵ�������" + i);
				break;
			}
			System.out.println("��Ѱ�У���ǰ����" + i);
		}
	}
}