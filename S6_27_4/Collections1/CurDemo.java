package S6_27_4.Collections1;

import java.util.Currency;
import java.util.Locale;

public class CurDemo {
	public static void main(String[] args) {
		Currency c;
		c=Currency.getInstance(Locale.US);
		System.out.println("Symbol:"+c.getSymbol());
		System.out.println("Number of digits after the decimal point:"+c.getDefaultFractionDigits());
	}

}
