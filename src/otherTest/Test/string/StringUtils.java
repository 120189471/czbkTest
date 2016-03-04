package otherTest.Test.string;

public class StringUtils {

	// String Compare example
	// compareTo(string)
	// compareToIgnoreCase(string)
	// compareTo(Object string)
	// ASCII
	public static void main(String args[]) {
		String str = "Hello World";
		String anotherString = "hello world";
		Object objStr = str;
		
		System.out.println(str.compareTo(anotherString));
		System.out.println(str.compareToIgnoreCase(anotherString)); //ºöÂÔ´óÐ¡Ð´
		System.out.println(str.compareTo(objStr.toString()));
	}
}
