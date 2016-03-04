package cn.day12.String.itcast_04;

import java.util.Scanner;

/*
	需求：统计一个字符串中的大写字母字符，小写字母字符，数字字符的个数
	举例： "Hello0123456World"
	结果：
		大写字符：2个
		小写字符：8个
		数字字符：3个
	分析：
		a:定义字符变量
		b:变量所有字符
		c:判断字符
		
		ACSII码表
		字符		0	48
		大写 		A	65
		小写		a	97
		
*/
public class StringTest2 {
	public static void main(String[] args) {
		//String s = "Hello0123456789azWorldAZdfe";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入测试字符串 ：");
		String s=sc.nextLine();
		int bigCount = 0;
		int smallCount = 0;
		int numberCount = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				numberCount++;
			} else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				bigCount++;
			} else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				smallCount++;
			}

		}
		System.out.println("numberCount = " + numberCount + ";");
		System.out.println("bigCount = " + bigCount + ";");
		System.out.println("smallCount = " + smallCount + ";");
	}

}
