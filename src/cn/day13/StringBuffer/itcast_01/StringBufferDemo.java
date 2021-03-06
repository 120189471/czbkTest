package cn.day13.StringBuffer.itcast_01;

/*
	StringBuffer的构造方法
		public StringBuffer()	无参构造方法
		public StringBuffer(int capacity)	指定容量的字符串缓冲区对象
		public StringBuffer(String str)		指定字符串内容的字符串缓冲区队形
	StringBuffer的方法
		public int capacity()	返回当前容量，理论值
		public int length()		返回长度（字符串） 实际值 
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
