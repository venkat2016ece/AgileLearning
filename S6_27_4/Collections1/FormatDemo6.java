package S6_27_4.Collections1;

import java.util.Calendar;
import java.util.Formatter;

public class FormatDemo6 {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();
        Calendar cal = Calendar.getInstance();

        fmt.format("It is% these. Day of the month% <tB year% <tY..", cal);
        System.out.println(fmt);
        fmt.close();
    }

}
