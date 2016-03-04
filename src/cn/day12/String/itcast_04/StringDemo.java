package cn.day12.String.itcast_04;
/*
	String类的获取功能
	int length								获取字符串的长度
	char charAt(int index)					获取指定索引位置的字符
	int indexOf(int ch)						返回指定字符串在此字符串中第一次出现的索引，注意为int类型
		
	int	indexOf(String str)					返回指定字符串在此字符串中第一次出现处的缩影
	int indexOf(int ch,int fromIndex)		返回指定字符在此字符串中从指定位置第一次出现处的索引
	int indexOf(String str,int fromIndex)	返回指定字符串在此字符串中从指定位置开始第一次出现出的索引
	String substring(int start)				从指定位置开始截取字符串，默认到末尾
	String subString(int start,int end)		从指定位置开始，指定位置结束，截取字符串
*/
public class StringDemo {
	public static void main(String[] args) {
		String s="Helloworld";
		System.out.println(s.length());
		System.out.println(s.charAt(0)+";");
		//System.out.println(s.charAt(20));	//String index out of rang
		System.out.println(s.indexOf("a"));
		System.out.println(s.indexOf(99));
		System.out.println(s.indexOf("rl"));
		System.out.println(s.indexOf("l",5));
		System.out.println(s.substring(3,5));
		System.out.println(s.substring(7));
		
		
	}

}
