package cn.day12.Scanner.itcast_01;

/*
 * Scanner:用于键盘录入
 * 
 * 	A：导包
 * 	B：创建对象
 * 	C：调用方法
 * 
 * System类下有一个静态的字段：
 * 	 public static final InputStream in 标准的数据流 
 * 	
 * 	InputStream is = System.in;	 
 * */

import java.util.Scanner;

public class StringDemo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println("x:" + x);

	}
}
