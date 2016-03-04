package cn.day12.String.ctcast_01;
/*
	字符串：字符组成的一串 数据，也可以看成数组
	通过api可知
		a：字符串字面值“abc”也可以看成是以字符串的对象
		b：字符串是敞亮，一旦被赋值，就不能改变
 	
 	构造方法：
 		public String();空构造
 		public String (byte[] bytes);把 字节数组转成字符串
 		public String (byte[] byts , int offset, int length);把字节数组的一部分转成字符串
 		public String (char[] value);把字符数组转成字符串
 		public String (char[] value, int offset ,int length);把字符数组的一部分转成字符串
 		public String (String original);把字符串常量转成字符串
 		
 	字符串的方法：
 		public int length();返回字符串的长度
  
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
		
		char[] chs= {'h','i','j','l','世','国'};
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
