package cn.day12.String.ctcast_03;

/*
	String����һ ���жϹ���
	boolean equals (Object obj)	:�Ƚ��ַ��������Ƿ���ͬ
	boolean equalsIgnoreCase(String str)���Ƚ��ַ��������Ƿ���ͬ�����Դ�Сд
	boolean contains(String str)���жϴ���ַ������Ƿ����С���ַ���
	boolean startWith(String str)���ж��ַ�������ָ���ַ���ͷ
	boolean endsWith(String str)���ж��ַ�������ָ���ַ�����β
	boolean isEmpty():�ж��ַ����Ƿ�Ϊ��
	
	ע�⣺
	�ַ�������Ϊ�պ��ַ�������Ϊ�ղ�ͬ
		String s = "";
		String s = null
    * */
public class StringDemo {
	public static void main(String[] args) {
		// �����ַ����Ķ���
		String s1 = "helloworld";
		String s2 = "helloworld";
		String s3 = "HelloWorld";

		// boolean equals (Object obj) :�Ƚ��ַ��������Ƿ���ͬ,���ִ�Сд
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println("----1------------------");

		// boolean equalsIgnoreCase(String str)���Ƚ��ַ��������Ƿ���ͬ�����Դ�Сд
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println("----2------------------");

		// boolean contains(String str)���жϴ���ַ������Ƿ����С���ַ���
		System.out.println(s1.contains("llow"));
		System.out.println(s1.contains("ower"));
		System.out.println(s1.contains("Hello"));
		System.out.println("----3------------------");

		// boolean startWith(String str)���ж��ַ�������ָ���ַ���ͷ
		System.out.println(s1.startsWith("h"));
		System.out.println(s1.startsWith("H"));
		System.out.println(s1.startsWith("hello"));
		System.out.println(s1.startsWith("llo"));
		System.out.println("----4------------------");

		// boolean endsWith(String str)���ж��ַ�������ָ���ַ�����β
		System.out.println(s1.endsWith("d"));
		System.out.println(s1.endsWith("D"));
		System.out.println(s1.endsWith("orld"));
		System.out.println(s1.endsWith("or"));
		System.out.println("----5------------------");

		// boolean isEmpty():�ж��ַ����Ƿ�Ϊ��
		String s4 = "";
		String s5 = null;
		System.out.println(s1.isEmpty());
		System.out.println(s4.isEmpty());
		//System.out.println(s5.isEmpty()); 
		//Null pointer access: The variable s5 can only be null at this location
		//NullPointerException ��ָ���쳣
		System.out.println("---6-------------------");

	}

}
