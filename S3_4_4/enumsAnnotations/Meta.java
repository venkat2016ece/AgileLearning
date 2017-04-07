
package S3_4_4.enumsAnnotations;

import java.lang.reflect.Method;

public class Meta {
    @MyAnno(str = "Hello Annotations", val = 19)
    public static void myMeth(String str, int i)
    {
        Meta ob = new Meta();

        try
        {
            Class c = ob.getClass();

            Method m = c.getMethod("myMeth", String.class, int.class);

            MyAnno anno = m.getAnnotation(MyAnno.class);

            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException exc){
            System.out.println("No such method exception");
        }
    }

    public static void main(String args[]){
        myMeth("test", 10);
    }
}