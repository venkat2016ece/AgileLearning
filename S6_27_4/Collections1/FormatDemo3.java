package S6_27_4.Collections1;

import java.util.Formatter;

public class FormatDemo3 {
	public static void main(String[] args) {
        Formatter fmt = new Formatter();

        fmt.format("Copying the file %n Transfer is ready in %d%%", 88);
        System.out.println(fmt);
        fmt.close();
    }

}
