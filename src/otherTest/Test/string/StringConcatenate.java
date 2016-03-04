package otherTest.Test.string;

public class StringConcatenate {

	public static void main(String args[]) {
		long startTime = System.currentTimeMillis();
		System.out.println("start time is " + startTime);

		for (int i = 0; i < 5000; i++) {
			String result = "This is ";
			result += "testing the ";
			result = result + " difference ";
			result = result + " between ";
			result = result + " String ";
			result = result + " and ";
			result = result + " StringBuffer";
		}

		long endTime = System.currentTimeMillis();

		System.out.println("�ַ�������ʹ��+����������" + (endTime - startTime) + "����");

		System.out.println("======���Ƿָ���=====");

		startTime = System.currentTimeMillis();

		for (int i = 0; i < 5000; i++) {
			StringBuffer result = new StringBuffer();
			result.append("This is ");
			result.append("testing the ");
			result.append(" difference ");
			result.append(" between ");
			result.append(" String ");
			result.append(" and ");
			result.append(" StringBuffer");
		}

		endTime = System.currentTimeMillis();

		System.out.println("�ַ�������ʹ��append��������" + (endTime - startTime) + "����");

	}
}
