package S6_27_4.Collections1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalendarDemo {

	public static void main(String[] args) {
		String months[]={"Jan", "Feb", "Mar", "Apr",
                "May", "Jun", "Jul", "Aug",
                "Sep", "Oct", "Nov", "Dec"};
		int year;
		GregorianCalendar calendar=new GregorianCalendar();
		System.out.println("Data: "+calendar.get((Calendar.DATE)));
		System.out.println(". "+months[calendar.get((Calendar.MONTH))]);
		System.out.println(year=calendar.get((Calendar.YEAR)));
		
		System.out.println("Godzina: "+calendar.get((Calendar.HOUR)));
		System.out.println(": "+calendar.get((Calendar.MINUTE)));
		System.out.println(": "+calendar.get((Calendar.SECOND)));
		
		if(calendar.isLeapYear(year)){
			System.out.println("The current year is leap year");
		}else{
			System.out.println("The current year is not leap year");
		}
	}

}
