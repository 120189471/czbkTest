package cn.day04.itcast_01;

/*
	形式参数问题：
		基本类型：形式参数的改变不影响实际参数
		引用类型：形式参数的改变直接影响实际参数
*/
public class ArgsTest {
	public static void main(String[] args) {
		// 形式参数是基本类型的调用
		Demo d = new Demo();
		System.out.println("result:" + d.sum(3, 4));
		System.out.println("-------------------");
		// 形式参数是应用类型的调用
		StudentDemo2 sd = new StudentDemo2();
		Student s = new Student();
		sd.method(s);
		System.out.println("-------------------");
		// 匿名参数的调用
		new StudentDemo2().method(new Student());

	}
}

// 形式参数是基本类型
class Demo {
	public int sum(int a, int b) {
		return a + b;
	}
}

// 形式参数是引用类型
class Student {
	public void show() {
		System.out.println("我爱学习");
	}
}

class StudentDemo2 {
	public void method(Student s) {
		s.show();
	}
}