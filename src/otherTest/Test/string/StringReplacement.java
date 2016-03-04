package otherTest.Test.string;

public class StringReplacement {
	//repalce
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello Hello world";
		System.out.println(str.replace("H", "W"));
		System.out.println(str.replaceFirst("He", "We"));
		System.out.println(str.replaceAll("He|wo", "Ha"));
	}

}
