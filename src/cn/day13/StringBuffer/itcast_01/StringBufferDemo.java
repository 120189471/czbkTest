package cn.day13.StringBuffer.itcast_01;

/*
	StringBuffer�Ĺ��췽��
		public StringBuffer()	�޲ι��췽��
		public StringBuffer(int capacity)	ָ���������ַ�������������
		public StringBuffer(String str)		ָ���ַ������ݵ��ַ�������������
	StringBuffer�ķ���
		public int capacity()	���ص�ǰ����������ֵ
		public int length()		���س��ȣ��ַ����� ʵ��ֵ 
*/
public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println("sb:" + sb);
		System.out.println("sb.capacity:" + sb.capacity());
		System.out.println("sb.length:" + sb.length());
		System.out.println("---------------------------");

		StringBuffer sb2 = new StringBuffer(30);
		System.out.println("sb2:" + sb2);
		System.out.println("sb2.capacity:" + sb2.capacity());
		System.out.println("sb2.length:" + sb2.length());
		System.out.println("---------------------------");

		StringBuffer sb3 = new StringBuffer("hello");
		System.out.println("sb3:" + sb3);
		System.out.println("sb3.capacity:" + sb3.capacity());
		System.out.println("sb3.length:" + sb3.length());
		System.out.println("---------------------------");
	}

}