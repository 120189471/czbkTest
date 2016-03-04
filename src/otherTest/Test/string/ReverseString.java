package otherTest.Test.string;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "gip a ma I";
		String reverse = new StringBuffer(str).reverse().toString();
		System.out.println("\nString before reverse:" + str);
		System.out.println("\nString after reverse:" + reverse);
	}

}
