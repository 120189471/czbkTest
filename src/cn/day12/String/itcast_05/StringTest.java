package cn.day12.String.itcast_05;
/*
	���󣺰�һ���ַ���������ĸת���ɴ�д������ΪСд
	
*/
public class StringTest {
	public static void main(String[] args) {
		 String s= "aBCDEFGHIjklmnopQIST";
		 String s1=s.substring(0, 1);
		 String s2=s.substring(1);
		 System.out.println(s1.toUpperCase().concat(s2.toLowerCase()));
		 System.out.println(s1.toLowerCase().concat(s2.toUpperCase()));
	}
}
