package otherTest.Test.date;

import java.util.Calendar;
import java.util.Date;

public class DateAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.roll(Calendar.DATE, -5);
		System.out.println(cal.get(Calendar.DATE));
		
		cal.roll(Calendar.MONTH, 8);
		System.out.println(cal.get(Calendar.YEAR));
	}

}
