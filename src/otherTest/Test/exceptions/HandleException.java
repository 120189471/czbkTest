package otherTest.Test.exceptions;

public class HandleException {

	public static void main(String args[]) {

		try {
			int i = 1 / 1;
			// throw new RuntimeException("����ʱ����");
		} catch (ArithmeticException e) {
			System.out.println("��������0���㷨���󣡣���");

		} catch (RuntimeException e) {
			System.out.println("����ʱ���󣡣���");

		} finally {
			System.out.println("��Դ�ѱ��ͷ�!!!");
		}
	}

}
