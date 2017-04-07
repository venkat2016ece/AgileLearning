package S3_4_4.enumsAnnotations;

public class Autobox2 {

    public static void main(String args[])
    {
        Integer iOb = 100;
        Double dOb = 98.6;

        dOb = dOb + iOb;
        System.out.println("dOb: " + dOb);

    }
}
