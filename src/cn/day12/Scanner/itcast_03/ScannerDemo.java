package cn.day12.Scanner.itcast_03;

import java.util.Scanner;

/*
 * 
 * 	���õķ�����
	public int nextInt(): ��ȡһ��int���͵�ֵ
	public String nextline():��ȡһ��Sting���͵�ֵ 
	
	��������
		�Ȼ�ȡһ����ֵ���ڻ�ȡһ���ַ��������������
		��Ҫԭ�򣬾��ǻ��з��ŵ�����
	�������
		A:�Ȼ�ȡһ��ֻ���ڴ���һ���µļ���¼������ȡ�ַ���
		B�������е����ݶ��Ȱ����ַ�����ȡ��Ȼ����Ҫʲô���ͣ�Ȼ��ת������Ӧ���ͣ��Ƽ���
		C�����ж�
	
 *
 */
public class ScannerDemo {
	public static void main(String[] args) {
		// ��������
		Scanner sc = new Scanner(System.in);
		// ��ȡ����int���͵�ֵ
		// int a = sc.nextInt();
		// int b = sc.nextInt();
		// System.out.println("a:" + a + "; b:" + b);
		// System.out.println("--------------------");

		// ��ȡ����String���͵�ֵ
		// String s2 = sc.nextLine();
		// String s3 = sc.nextLine();
		// System.out.println("s2:" + s2);
		// System.out.println("s3:" + s3);
		// System.out.println("--------------------");
		
		// �Ȼ�ȡһ��String���͵�ֵ���ڻ�ȡһ��int���͵�ֵ
		// String s6 = sc.nextLine();
		// int s7 = sc.nextInt();
		// System.out.println("s6:" + s6);
		// System.out.println("s7:" + s7);
		// System.out.println("-----------------");
		
		// �Ȼ�ȡһ��int���͵�ֵ���ڻ�ȡһ��Sting���͵�ֵ
		 int s4 = sc.nextInt();
		 String s5 = sc.nextLine();
		 System.out.println("s4:" + s4);
		 System.out.println("s5" + s5);
		 System.out.println("---------------------");
	}

}
