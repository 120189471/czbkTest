package cn.day12.Scanner.itcast_02;

import java.util.Scanner;

/*
 * Scanner����������ʽ��
 * 		public boolean hasNexXxx():�ж����Ƿ���ĳ�����͵�Ԫ��
 * 		public Xxx nextXxx()	:��ȡ��Ԫ��
 * 	ex.
 * 		public bollean hasNextint();
 * 		public int nextXxxx		
 * 
 * 	InputMismatchException	�������Ͳ�ƥ��
 * 
 * */

public class ScannerDemo {
	public static void main(String[] args) {
		// ��������
		Scanner sc = new Scanner(System.in);
		// ��ȡ����
		if (sc.hasNextInt()) {
			int x = sc.nextInt();
			System.out.println("x:" + x);
		}else {
			System.out.println("��������ֲ�Ϊ����");
		}
	}
}
