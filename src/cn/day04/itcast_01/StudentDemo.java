package cn.day04.itcast_01;
/*
	封装:隐藏对象的属性和实现细节，仅对对外提供公共访问方式
*/
public class StudentDemo {
	public static void main(String[] args) {
		Student2 s=new Student2();
		s.show();
		System.out.println("-----------");
		s.name="黄飞鸿";
		s.setAge(20);
		s.show();
		System.out.println("-----------");
		
		s.name="鬼脚七";
		s.setAge(100);
		s.show();
				
	}
}

class Student2 {
	String name;
	//私有修饰成员变量和成成员方法，只能在本类中被访问
	private int age;

	public void setAge(int a) {
		if (a < 0 || age > 120) {
			System.out.println("你给的年龄有问题");
		} else {
			age = a;
		}
	}
	
	public void show(){
		System.out.println("姓名："+name);
		System.out.println("年龄："+age);
	}
}
