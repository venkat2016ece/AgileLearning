package S3_6_4.RepeatableAnnotation;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Repeatable(MyAnnos.class)
@interface MyAnno{
	int value();
}
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnos{
	MyAnno[] value();
}

@MyAnno(value=-2)
@MyAnno(value=100)
public class RepeatAnno {

}
