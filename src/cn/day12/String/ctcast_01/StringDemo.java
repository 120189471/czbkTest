package cn.day12.String.ctcast_01;
/*
	�ַ������ַ���ɵ�һ�� ���ݣ�Ҳ���Կ�������
	ͨ��api��֪
		a���ַ�������ֵ��abc��Ҳ���Կ��������ַ����Ķ���
		b���ַ����ǳ�����һ������ֵ���Ͳ��ܸı�
 	
 	���췽����
 		public String();�չ���
 		public String (byte[] bytes);�� �ֽ�����ת���ַ���
 		public String (byte[] byts , int offset, int length);���ֽ������һ����ת���ַ���
 		public String (char[] value);���ַ�����ת���ַ���
 		public String (char[] value, int offset ,int length);���ַ������һ����ת���ַ���
 		public String (String original);���ַ�������ת���ַ���
 		
 	�ַ����ķ�����
 		public int length();�����ַ����ĳ���
  
 * */

public class StringDemo {
	public static void main(String[] args) {
		String s1 = new String();
		System.out.println("s1:" + s1);
		System.out.println("s1.length:" + s1.length());

		byte[] bys = { 97, 98, 99, 100, 101, 102, 103, 104, 122 };
		String s2 = new String(bys);
		System.out.println("s2:" + s2);
		System.out.println("s2.length:" + s2.length());

		String s3 = new String(bys,0,3);
		System.out.println("s2:" + s3);
		System.out.println("s2.length:" + s3.length());
		
		char[] chs= {'h','i','j','l','��','��'};
		String s4 = new String(chs);
		System.out.println("s4:"+s4);
		System.out.println("s4.length:"+s4.length());
		
		String s5 =new String(chs,4,2);
		System.out.println("s5:"+s5);
		System.out.println("s5.length:"+s5.length());
		
		String s6 = new String("jklmn");
		System.out.println("s6:"+s6);
		System.out.println("s6.length:"+s6.length());

	}

}
