package S3_4_4.enumsAnnotations;

public class EnumDemo4 {
    public static void main(String args[])
    {
        Apple ap, ap2, ap3;

        System.out.println("Enumeration Demo:");
        for(Apple a : Apple.values()){
            System.out.println(a + " " + a.ordinal());
        }

        ap = Apple.RedDel;
        ap2 = Apple.GldenDel;
        ap3 = Apple.RedDel;

        if(ap.compareTo(ap2) < 0 ){
            System.out.println(ap + " less than " + ap2);
        }
        if(ap.compareTo(ap2) > 0 ){
            System.out.println(ap2 + " greater than " + ap);
        }
        if(ap.compareTo(ap3) == 0 ){
            System.out.println(ap + " jest  " + ap3);
        }

        if(ap.equals(ap2)){
            System.out.println("equals");
        }
        if(ap.equals(ap3)){
            System.out.println("jest ok");
        }
    }
}
