package cn.day12.Scanner.itcast_02;

import java.util.Scanner;

/*
 * Scanner方法基本格式：
 * 		public boolean hasNexXxx():判读啊是否是某种类型的元素
 * 		public Xxx nextXxx()	:获取该元素
 * 	ex.
 * 		public bollean hasNextint();
 * 		public int nextXxxx		
 * 
 * 	InputMismatchException	输入类型不匹配
 * 
 * */

public class ScannerDemo {
	public static void main(String[] args) {
		// 常见对象
		Scanner sc = new Scanner(System.in);
		// 获取数据
		if (sc.hasNextInt()) {
			int x = sc.nextInt();
			System.out.println("x:" + x);
		}else {
			System.out.println("输入的数字不为数字");
		}
	}
}
