package S2_31_3.Anotations;

import java.lang.reflect.Method;

public class TestAnnotation {

    public static void main(String[] args) {

        AnnotationRunner runner = new AnnotationRunner(); // creating oject of Annotation Runner
        Method[] methods = runner.getClass().getMethods(); // calling methods of Annotation runner

        for (Method method : methods) {
            RunAnnotation run = method.getAnnotation(RunAnnotation.class);
            if (run != null) {
                try {
                    method.invoke(runner);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
} 