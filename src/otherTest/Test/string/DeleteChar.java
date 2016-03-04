package otherTest.Test.string;

public class DeleteChar {

	//substring()
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Today is sunny day";
		System.out.println(removeCharAt(str, 5));
	}

	public static String removeCharAt(String s, int pos){
		return s.substring(0, pos) + s.substring(pos + 1);
	}
}
