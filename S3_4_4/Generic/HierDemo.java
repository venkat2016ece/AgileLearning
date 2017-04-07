package S3_4_4.Generic;

public class HierDemo {
    public static void main(String args[]){
        Gen2<String, Integer> x = new Gen2<>("hi", 2);

        System.out.print(x.getOb());
        System.out.println(x.getOb2());
    }
}
