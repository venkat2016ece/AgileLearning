package S3_6_4.RepeatableAnnotation;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Repeatable(MyColorsArray.class)
@interface MyColor{
	String name();
}

@Retention(RetentionPolicy.RUNTIME)
@interface MyColorsArray{
	MyColor[] value();
}

@MyColor(name="My favcolor is red shirt")
@MyColor(name="My favcolor is blue shirt")
@MyColor(name="My favcolor is green shirt")
public class FavColor {

}
