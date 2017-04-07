package S3_4_4.enumsAnnotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created by test
 */

@What(description = "Annotations description")
@MyAnno(str = "Meta2", val=99)
public class Meta2 {
    @MyAnno(str = "Annotations test", val = 100)
    @What(description = "testing annotations")
    public static void myMeth()
    {
        Meta2 ob = new Meta2();

        try
        {
            Annotation annos[] = ob.getClass().getAnnotations();

            System.out.println("Traversing annotations: ");
            for (Annotation a : annos)
                System.out.println(a);

            Method m = ob.getClass().getMethod("myMeth");
            annos = m.getAnnotations();
            System.out.println("Traversing annotation methods: ");
            for (Annotation a : annos)
                System.out.println(a);

        } catch (NoSuchMethodException exc){
            System.out.println("No such method");
        }
    }

    public static void main(String args[]){
        myMeth();
    }
}
