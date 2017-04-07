package S3_4_4.enumsAnnotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by test
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface What {
    String description();
}
