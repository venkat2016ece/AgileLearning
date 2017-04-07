package S3_4_4.enumsAnnotations;

import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MySingle {
	int value();

}
