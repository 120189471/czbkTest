package cn.day12.String.itcast_05;
/*
	String的转换功能
	byte[] getBytes()						把字符串转化为字节数组
	char[] toCharArray()					把字符串转化为字符数组
	static String valueOf(char[] chs)		把字符数组转换成字符串
	static String valueOF(int i)			吧int类型的数据转换成字符串
		注意：String类的valueOf方法可以把任意类型的数据转换成字符串
	String toLowerCase()					把字符串转换成小写
	String toUpperCase()					把字符串转换成大写
	String concet(String str)				把字符串拼接
*/

public class StringDemo {
	public static void main(String[] args) {
		String s ="java SE";
		byte[] bys=s.getBytes();
		for (int i = 0; i < bys.length; i++) {
			System.out.println(i+":"+bys[i]+";");
		}
		System.out.println("------------------");
		
		char[] chr=s.toCharArray();
		for (int i = 0; i < chr.length; i++) {
			System.out.println(i+":"+chr[i]+";");
		}
		System.out.println("------------------");
		
		String s1=String.valueOf(chr);
		System.out.println("s1:"+s1);
		System.out.println("------------------");
		
		String s2=String.valueOf(bys);
		System.out.println("s2:"+s2);
		System.out.println("------------------");
		
		String s3=s.toLowerCase();
		System.out.println("s3:"+s3);
		System.out.println("------------------");
		
		String s4=s.toUpperCase();
		System.out.println("s4:"+s4);
		System.out.println("------------------");
		
		String s5=s.concat("123456");
		System.out.println("s5"+s5);
		String s6=s.concat(s4);

		System.out.println("s6"+s6);
		System.out.println("------------------");
		System.out.println("------------------");
	}

}
