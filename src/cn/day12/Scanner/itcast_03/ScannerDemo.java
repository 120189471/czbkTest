package cn.day12.Scanner.itcast_03;

import java.util.Scanner;

/*
 * 
 * 	常用的方法：
	public int nextInt(): 获取一个int类型的值
	public String nextline():获取一个Sting类型的值 
	
	出现问题
		先获取一个数值，在获取一个字符串，会出现问题
		主要原因，就是换行符号的问题
	解决方案
		A:先获取一个只，在创建一个新的键盘录入对象获取字符串
		B：把所有的数据都先按照字符串获取，然后需要什么类型，然后转换成相应类型（推荐）
		C：加判断
	
 *
 */
public class ScannerDemo {
	public static void main(String[] args) {
		// 创建对象
		Scanner sc = new Scanner(System.in);
		// 获取两个int类型的值
		// int a = sc.nextInt();
		// int b = sc.nextInt();
		// System.out.println("a:" + a + "; b:" + b);
		// System.out.println("--------------------");

		// 获取两个String类型的值
		// String s2 = sc.nextLine();
		// String s3 = sc.nextLine();
		// System.out.println("s2:" + s2);
		// System.out.println("s3:" + s3);
		// System.out.println("--------------------");
		
		// 先获取一个String类型的值，在获取一个int类型的值
		// String s6 = sc.nextLine();
		// int s7 = sc.nextInt();
		// System.out.println("s6:" + s6);
		// System.out.println("s7:" + s7);
		// System.out.println("-----------------");
		
		// 先获取一个int类型的值，在获取一个Sting类型的值
		 int s4 = sc.nextInt();
		 String s5 = sc.nextLine();
		 System.out.println("s4:" + s4);
		 System.out.println("s5" + s5);
		 System.out.println("---------------------");
	}

}
