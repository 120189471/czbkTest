package cn.day04.itcast_01;

/*
	��ʽ�������⣺
		�������ͣ���ʽ�����ĸı䲻Ӱ��ʵ�ʲ���
		�������ͣ���ʽ�����ĸı�ֱ��Ӱ��ʵ�ʲ���
*/
public class ArgsTest {
	public static void main(String[] args) {
		// ��ʽ�����ǻ������͵ĵ���
		Demo d = new Demo();
		System.out.println("result:" + d.sum(3, 4));
		System.out.println("-------------------");
		// ��ʽ������Ӧ�����͵ĵ���
		StudentDemo2 sd = new StudentDemo2();
		Student s = new Student();
		sd.method(s);
		System.out.println("-------------------");
		// ���������ĵ���
		new StudentDemo2().method(new Student());

	}
}

// ��ʽ�����ǻ�������
class Demo {
	public int sum(int a, int b) {
		return a + b;
	}
}

// ��ʽ��������������
class Student {
	public void show() {
		System.out.println("�Ұ�ѧϰ");
	}
}

class StudentDemo2 {
	public void method(Student s) {
		s.show();
	}
}