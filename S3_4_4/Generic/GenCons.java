package S3_4_4.Generic;


public class GenCons {
    private double val;

    <T extends Number> GenCons(T arg){
        val = arg.doubleValue();
    }

    void showval(){
        System.out.println("ShowVal: " + val);
    }
}

class GenConsDemo{
    public static void main(String args[]){
        GenCons test = new GenCons(100);
        GenCons test2 = new GenCons(123.5F);
        test.showval();
        test2.showval();
    }
}
