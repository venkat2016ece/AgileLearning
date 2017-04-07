package S3_6_4.RepeatableAnnotation;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Repeatable(Colors.class)
@interface Color{
	String name();
}
@Retention(RetentionPolicy.RUNTIME)
@interface Colors{
	Color[] value();
}
@Color(name="red")
@Color(name="blue")
@Color(name="green")
public class Shirt {

}
