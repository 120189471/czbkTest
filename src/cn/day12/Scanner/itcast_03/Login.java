package cn.day12.Scanner.itcast_03;
/*
	ģ���û���½�������λ��ᣬ����ʾ���м���
	
	������
	
	�����û�������
	������½����
	�ȶ��û�����
	�ȶ����룬�жϴ�Сд��
		����û��������������ʾ�û�����������󣬲���ʾ��ʣ�༸��
	����������Σ���ôֹͣ���� ������ʾ�����������
	
*/

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		String user01 = "tEst001";
		String pwd01 = "pWd001";

		Scanner sc = new Scanner(System.in);

		for (int i = 2; i >= 0 ; i--) {

			System.out.println("�������û�����");
			String scUser = sc.nextLine();
			System.out.println("���������룺");
			String scpwd = sc.nextLine();
			
			if (scUser.equals(user01)&scpwd.equals(pwd01)) {
				System.out.println("��½�ɹ�");
				break;
			}else if(i==0){
				System.out.println("5Сʱ���޷�����");
			}else{
				System.out.println("�û���������������������룬��������"+i+"��");
			}
			
		}

	}
}
