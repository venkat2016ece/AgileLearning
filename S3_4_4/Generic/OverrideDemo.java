package S3_4_4.Generic;

public class OverrideDemo {
    public static void main(String args[]){
        Gen<Integer> iOb = new Gen<>(88);
        Gen3<Integer> iOb3 = new Gen3<>(99);
        Gen3<String> strOb2 = new Gen3<>("Test");

        System.out.println(iOb.getOb());
        System.out.println(iOb3.getOb());
        System.out.println(strOb2.getOb());
    }
}
