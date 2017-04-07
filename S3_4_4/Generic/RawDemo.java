package S3_4_4.Generic;

public class RawDemo {
    public static void main(String args[]){
        Gen<Integer> iOb = new Gen<>(88);
        Gen<String> sOb = new Gen<>("Test");

        Gen raw = new Gen(new Double(98.4));

        double d = (Double) raw.getOb();
        System.out.println("value of d is : "+d);
    }
}
