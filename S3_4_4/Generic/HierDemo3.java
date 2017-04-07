package S3_4_4.Generic;

public class HierDemo3 {
    public static void main(String args[]){

        Gen<Integer> iOb = new Gen<>(88);

        Gen3<Integer> iOb2 = new Gen3<>(99);

        Gen3<String> strOb3 = new Gen3<>("Test");

        if(iOb2 instanceof Gen3<?>) System.out.println("iOb2 to Gen2");
        if(iOb2 instanceof Gen<?>) System.out.println("iOb2 to Gen");
        if(strOb3 instanceof Gen3<?>) System.out.println("strOb3 to  Gen2");
        if(strOb3 instanceof Gen<?>) System.out.println("strOb3 to  Gen");
        if(iOb instanceof Gen3<?>) System.out.println("iOb to  Gen2");
        if(iOb instanceof Gen<?>) System.out.println("iOb to  Gen");
    }
}
