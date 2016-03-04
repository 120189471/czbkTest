package otherTest.Test.string;

public class SplitString {

	// split
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "jan-feb-march";
		String[] temp;
		String delimeter = "-";
		temp = str.split(delimeter);
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
		
		System.out.println("=======我是分割线========");
		
		str = "jan.feb.march";
		delimeter = "\\.";
		temp = str.split(delimeter);
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}		
	}

}
