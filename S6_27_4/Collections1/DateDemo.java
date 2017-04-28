package S6_27_4.Collections1;

import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		Date date=new Date();
		System.out.println(date);
		long msec=date.getTime();
		System.out.println("Milliseconds from 1st 1970="+msec);
	}

}
