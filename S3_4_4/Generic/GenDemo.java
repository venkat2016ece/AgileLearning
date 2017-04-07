package S3_4_4.Generic;

public class GenDemo {
    public static void main(String args[]){
        Gen<Integer> iOb;

        iOb = new Gen<Integer>(88);

        iOb.showType();

        int v = iOb.getOb();
        System.out.println("get value: " + v);

        Gen<String> strOb = new Gen<String>("Test");

        strOb.showType();

        String str = strOb.getOb();
        System.out.println("tested " + str);

    }
}
