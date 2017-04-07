package S2_31_3.Anotations;

public class AnnotationRunner {

    @RunAnnotation
    public void method1() {
        System.out.println("Annotated method1 called.");
    }

    @RunAnnotation
    public void method2() {
        System.out.println("Annotated method2 called.");
    }

    public void method3() {
        System.out.println("Method withoud annotation");
    }  
}

