package S3_4_4.enumsAnnotations;

import java.lang.reflect.Method;

public class Marker {
    @MyMarker
    public static void myMeth()
    {
        Marker ob = new Marker();

        try
        {
            Method m = ob.getClass().getMethod("myMeth");

            if(m.isAnnotationPresent(MyMarker.class))
                System.out.println("Annotation exists");

        } catch (NoSuchMethodException exc){
            System.out.println("exception caught");
        }
    }

    public static void main(String args[]){
        myMeth();
    }
}
