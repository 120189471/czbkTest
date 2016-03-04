package otherTest.Test.string;

public class FindString {

	//indexOf()
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strOrig = "Hello world ,Hello Reader";
		int index = strOrig.indexOf("Hello");
		if (index == -1) {
			System.out.println("Hello not found");
		} else {
			System.out.println("First occurrence of Hello is at index "
					+ index);
		} 
	}

}
