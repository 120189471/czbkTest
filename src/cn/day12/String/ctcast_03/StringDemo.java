package cn.day12.String.ctcast_03;

/*
	String功能一 ：判断功能
	boolean equals (Object obj)	:比较字符串内容是否相同
	boolean equalsIgnoreCase(String str)：比较字符串内容是否相同，忽略大小写
	boolean contains(String str)：判断大的字符串中是否包含小的字符串
	boolean startWith(String str)：判断字符串是以指定字符开头
	boolean endsWith(String str)：判断字符串是以指定字符串结尾
	boolean isEmpty():判断字符串是否为空
	
	注意：
	字符串内容为空和字符串对象为空不同
		String s = "";
		String s = null
    * */
public class StringDemo {
	public static void main(String[] args) {
		// 创建字符串的对象
		String s1 = "helloworld";
		String s2 = "helloworld";
		String s3 = "HelloWorld";

		// boolean equals (Object obj) :比较字符串内容是否相同,区分大小写
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println("----1------------------");

		// boolean equalsIgnoreCase(String str)：比较字符串内容是否相同，忽略大小写
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println("----2------------------");

		// boolean contains(String str)：判断大的字符串中是否包含小的字符串
		System.out.println(s1.contains("llow"));
		System.out.println(s1.contains("ower"));
		System.out.println(s1.contains("Hello"));
		System.out.println("----3------------------");

		// boolean startWith(String str)：判断字符串是以指定字符开头
		System.out.println(s1.startsWith("h"));
		System.out.println(s1.startsWith("H"));
		System.out.println(s1.startsWith("hello"));
		System.out.println(s1.startsWith("llo"));
		System.out.println("----4------------------");

		// boolean endsWith(String str)：判断字符串是以指定字符串结尾
		System.out.println(s1.endsWith("d"));
		System.out.println(s1.endsWith("D"));
		System.out.println(s1.endsWith("orld"));
		System.out.println(s1.endsWith("or"));
		System.out.println("----5------------------");

		// boolean isEmpty():判断字符串是否为空
		String s4 = "";
		String s5 = null;
		System.out.println(s1.isEmpty());
		System.out.println(s4.isEmpty());
		//System.out.println(s5.isEmpty()); 
		//Null pointer access: The variable s5 can only be null at this location
		//NullPointerException 空指针异常
		System.out.println("---6-------------------");

	}

}
