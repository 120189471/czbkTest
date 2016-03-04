package cn.day12.String.ctcast_02;

/*
	字符串的特点：一旦被赋值（值 不变 ），就不能改变
		字符串直接赋值，是在方法区字符串常量池进行搜索，如果没有，就在创建，然后地址传送给栈内存，方法区内的数据赋值后就不能改变

*/

public class StringDemo {
	public static void main(String[] args) {
		String s = "hello";
		s += "world";
		System.out.println("s:"+s);
	}

}
