package cn.day12.String.ctcast_02;

/*
	String s= new String("hello") ��  String s = "hello" ������
	
	�У�ǰ�ߴ���2������һ���ڷ���ȥ��һ���ڶ��ڴ���
		����ֻ����һ������ֻ�ڷ�������
	
	�Ƚ�
		== �� �Ƚ��������ͣ��Ƚϵ��ǵ�ֵַ�Ƿ���ͬ
		equals��	�Ƚϵ���������Ҳ�ǱȽϵ�ֵַ�Ƿ���ͬ����String��д��equals()�������Ƚϵ��������Ƿ���ͬ
*/

public class StringDemo2 {
	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = "hello";
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));

	}

}
