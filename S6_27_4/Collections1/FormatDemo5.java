package S6_27_4.Collections1;

import java.util.Formatter;

public class FormatDemo5 {
	public static void main(String[] args) {
        Formatter fmt = new Formatter();

        fmt.format("|% d|", -100);
        System.out.println(fmt);
        fmt.close();

        fmt = new Formatter();
        fmt.format("|% d|", 100);
        System.out.println(fmt);
        fmt.close();

        fmt = new Formatter();
        fmt.format("|% d|", -20);
        System.out.println(fmt);
        fmt.close();

        fmt = new Formatter();
        fmt.format("|% d|", 200);
        System.out.println(fmt);
        fmt.close();
    }

}
