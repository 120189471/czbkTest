package cn.day12.String.ctcast_02;

/*
	String s= new String("hello") 和  String s = "hello" 的区别
	
	有，前者创建2个对象，一个在方法去，一个在堆内存中
		后者只创建一个对象，只在方法区中
	
	比较
		== ： 比较引用类型，比较的是地址值是否相同
		equals：	比较的引用类型也是比较地址值是否相同，而String重写了equals()方法，比较的是内容是否相同
*/

public class StringDemo2 {
	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = "hello";
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));

	}

}
