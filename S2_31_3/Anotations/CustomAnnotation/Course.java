package S2_31_3.Anotations.CustomAnnotation;

import java.lang.annotation.*;

@Inherited
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Course {
String cid() default "c-111";
String cname() default "c-programing lang";
int ccos() default 1000;

}
