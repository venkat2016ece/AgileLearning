package S6_27_4.Collections1;

import java.util.Calendar;

public class CalendarDemo {
	public static void main(String[] args) {
		String months[]={
				"jan","fe","mar","Apr",
				"may","Jun","Jul","Aug",
				"Sep","Oct","Nov","Dec"
		};
		Calendar calendar=Calendar.getInstance();
		System.out.println("Data:"+ calendar.get(Calendar.DATE));
		System.out.println("."+months[calendar.get(Calendar.MONTH)]);
		System.out.println(""+calendar.get(Calendar.YEAR));
		System.out.println("Hour:"+calendar.get(Calendar.MINUTE));
		System.out.println("Hour:"+calendar.get(Calendar.SECOND));
		
		
		calendar.set(Calendar.HOUR,10);
		calendar.set(Calendar.MINUTE,19);
		calendar.set(Calendar.SECOND,22);
		
		System.out.println("Updated Hour:"+calendar.get(Calendar.HOUR));
		System.out.println(":"+calendar.get(Calendar.MINUTE));
		System.out.println(":"+calendar.get(Calendar.SECOND));
	}

}
