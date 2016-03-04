package cn.day13.StringBuffer.itcast_02;
/*
	StringBuffer添加功能：
		public StringBuffer append (String str)
			 可以把任意类型的数据添加到字符串缓冲区里面，并返回给字符串缓冲区本身
		public StringBuffer insert（int offset,String str）
			在指定位置插入任意类型的数据并返回给字符串缓冲区本身
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
