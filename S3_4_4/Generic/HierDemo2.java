package S3_4_4.Generic;

public class HierDemo2 {
    public static void main(String args[]){
        NonGenExt<String> x = new NonGenExt<>("there", 2);

        System.out.print(x.getOb());
    }
}
