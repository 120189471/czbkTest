package otherTest.Test.date;

import java.util.Calendar;

public class GetDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		int day = cal.get(Calendar.DATE);
		System.out.println("������" + day + "��");
		int month = cal.get(Calendar.MONTH) + 1;
		System.out.println("������" + month + "��");
		int year = cal.get(Calendar.YEAR);
		System.out.println("������" + year + "��");
		
		int dow = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("������һ���еĵ�" + dow + "��");
		int dom = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println("������һ���е�" + dom + "��");
		int doy = cal.get(Calendar.DAY_OF_YEAR);
		System.out.println("������һ���е�" + doy + "��");
	}

}
