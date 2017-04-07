package S3_4_4.Generic;

public class GenMethDemo {

    static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y){

        for (int i=0; i<y.length; i++)
            if(x.equals(y[i])) return true;
        return false;
    }

    public static void main(String args[]){
        Integer nums[] = {1,2,3,4,5,6};

        if(isIn(2, nums))
            System.out.println("2 exists in nums");
        if(!isIn(7, nums))
            System.out.println("7 does not exists in nums");

        String strs[] = {"jeden", "dwa", "trzy", "cztery", "test"};
        if(isIn("dwa", strs))
            System.out.println("dwa exists in strs");
        if(!isIn("tests", strs))
            System.out.println("tests doesnot exists in strs");

        Double shrt[] = {1.0,2.0,3.0};
        if(isIn(2.0,shrt))
            System.out.println("OK");
    }
}
