package cn.day12.Scanner.itcast_01;

/*
 * Scanner:���ڼ���¼��
 * 
 * 	A������
 * 	B����������
 * 	C�����÷���
 * 
 * System������һ����̬���ֶΣ�
 * 	 public static final InputStream in ��׼�������� 
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
