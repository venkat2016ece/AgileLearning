package S6_27_4.Collections1;

import java.util.Formatter;

public class FormatDemo {
	public static void main(String[] args) {

        try(Formatter fmt = new Formatter()){


            fmt.format("Formatting %s is very simple: %d %f", "In Java", 10, 98.6);

            System.out.println(fmt);

        }


    }



}
