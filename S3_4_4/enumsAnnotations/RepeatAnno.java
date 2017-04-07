package S3_4_4.enumsAnnotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@MyAnno(str = "initial value", val = -1)
@MyAnno(str = "additional value", val = 100)
public class RepeatAnno {
     
    public static void myMeth(String str, int i)
    {
        RepeatAnno ob = new RepeatAnno();

        try
        {
            Class<?> c = ob.getClass();

            Method m = c.getMethod("myMeth", String.class, int.class);

            Annotation anno = m.getAnnotation(MyRepeatedAnnos.class);

            System.out.println(anno);

        } catch (NoSuchMethodException exc){
            System.out.println("No such method");
        }
    }

    public static void main(String args[]){
        myMeth("test", 10);
    }
}
