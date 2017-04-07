package S3_4_4.enumsAnnotations;

public class Autobox {

    public static void main(String args[])
    {
        Integer iOb, iOb2;
        int i;

        iOb = 100;
        System.out.println("iOb: " +iOb);
        System.out.println("++iOb: " + ++iOb);

        iOb2 = iOb + (iOb / 3);
        System.out.println("iOb2: " + iOb2);

        i = iOb + (iOb / 3);
        System.out.println("i: " + i);

    }
}
