package cn.day13.StringBuffer.itcast_02;
/*
	StringBuffer��ӹ��ܣ�
		public StringBuffer append (String str)
			 ���԰��������͵�������ӵ��ַ������������棬�����ظ��ַ�������������
		public StringBuffer insert��int offset,String str��
			��ָ��λ�ò����������͵����ݲ����ظ��ַ�������������
*/

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		System.out.println("sb:" + sb);
		System.out.println("sb.capacity:" + sb.capacity());
		System.out.println("sb.length:" + sb.length());

		// sb.append("world");
		// System.out.println("sb.capacity:" + sb.capacity());
		// System.out.println("sb.length:" + sb.length());

		sb.append("world").append(1233210);
		System.out.println("sb:" + sb);
		System.out.println("sb.capacity:" + sb.capacity());
		System.out.println("sb.length:"+sb.length());

		sb.insert(10, "Java");
		System.out.println("sb.insert:"+sb);
		System.out.println("sb.capacity:"+sb);
		System.out.println("sb.length:"+sb);
	}

}
