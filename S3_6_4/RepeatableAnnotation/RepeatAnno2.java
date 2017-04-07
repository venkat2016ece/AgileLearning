package S3_6_4.RepeatableAnnotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import S3_6_4.RepeatableAnnotation.RepeatAnno;

public class RepeatAnno2 {
	
	public static void main(String[] args) {
//		myMeth("test",10);
		MyAnno[] colorArray=RepeatAnno.class.getAnnotationsByType(MyAnno.class);
		for(MyAnno venkat:colorArray){
			System.out.println(venkat.value());
		}
	}

}
