package cn.day12.String.itcast_04;

import java.util.Scanner;

/*
	����ͳ��һ���ַ����еĴ�д��ĸ�ַ���Сд��ĸ�ַ��������ַ��ĸ���
	������ "Hello0123456World"
	�����
		��д�ַ���2��
		Сд�ַ���8��
		�����ַ���3��
	������
		a:�����ַ�����
		b:���������ַ�
		c:�ж��ַ�
		
		ACSII���
		�ַ�		0	48
		��д 		A	65
		Сд		a	97
		
*/
public class StringTest2 {
	public static void main(String[] args) {
		//String s = "Hello0123456789azWorldAZdfe";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("����������ַ��� ��");
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
