package S3_4_4.enumsAnnotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created by test
 */

public class Meta3 {
    @MyAnno()default
    public static void myMeth()
    {
        Meta3 ob = new Meta3();

        try
        {
            Class c = ob.getClass();

            Method m = c.getMethod("myMeth");

            MyAnno anno = m.getAnnotation(MyAnno.class);

            System.out.println(anno.str() + " " + anno.val());

        } catch (NoSuchMethodException exc){
            System.out.println("No such method");
        }
    }

    public static void main(String args[]){
        myMeth();
    }
}
