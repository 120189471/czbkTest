package cn.day04.itcast_01;
/*
	��װ:���ض�������Ժ�ʵ��ϸ�ڣ����Զ����ṩ�������ʷ�ʽ
*/
public class StudentDemo {
	public static void main(String[] args) {
		Student2 s=new Student2();
		s.show();
		System.out.println("-----------");
		s.name="�Ʒɺ�";
		s.setAge(20);
		s.show();
		System.out.println("-----------");
		
		s.name="�����";
		s.setAge(100);
		s.show();
				
	}
}

class Student2 {
	String name;
	//˽�����γ�Ա�����ͳɳ�Ա������ֻ���ڱ����б�����
	private int age;

	public void setAge(int a) {
		if (a < 0 || age > 120) {
			System.out.println("���������������");
		} else {
			age = a;
		}
	}
	
	public void show(){
		System.out.println("������"+name);
		System.out.println("���䣺"+age);
	}
}
