package cn.day12.Scanner.itcast_03;
/*
	模拟用户登陆，给三次机会，并提示还有几次
	
	分析：
	
	创建用户和密码
	创建登陆次数
	比对用户名，
	比对密码，判断大小写，
		如果用户名和密码错误，提示用户名或密码错误，并提示还剩余几次
	如果超过三次，那么停止输入 ，并提示超过输入次数
	
*/

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		String user01 = "tEst001";
		String pwd01 = "pWd001";

		Scanner sc = new Scanner(System.in);

		for (int i = 2; i >= 0 ; i--) {

			System.out.println("请输入用户名：");
			String scUser = sc.nextLine();
			System.out.println("请输入密码：");
			String scpwd = sc.nextLine();
			
			if (scUser.equals(user01)&scpwd.equals(pwd01)) {
				System.out.println("登陆成功");
				break;
			}else if(i==0){
				System.out.println("5小时内无法输入");
			}else{
				System.out.println("用户名和密码错误，请重新输入，还可输入"+i+"次");
			}
			
		}

	}
}
