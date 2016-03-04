package otherTest.Test.date;

import java.text.SimpleDateFormat;

public class ConvertTimestamp {

	public static void main(String args[]) {
		Long timeStamp = System.currentTimeMillis();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
//		String sd = sdf.format(Long.parseLong(String.valueOf(timeStamp)));
		String sd = sdf.format(timeStamp);
		System.out.println(sd);
		Integer.parseInt("1234");
	}
}
