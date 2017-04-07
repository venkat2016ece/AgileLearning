package S2_31_3.Anotations.CustomAnnotation;

import java.lang.annotation.*;

public class Test {
public static void main(String[] args) throws Exception {
	Student s=new Student("s-111","venakat","hyd");
	s.getStudentDetails();
	Class c=s.getClass();	// s.getClass gives Student as class to Class c
	//Method m=c.getMethod(getStudentDetails);
	//Annotation ann=m.getAnnotation(Course.class);
	
	Annotation ann=c.getAnnotation(Course.class);	// Annotation ann calling Course annotation
	Course crs=(Course)ann;		//	create crs as Course instance to annotation ann
	System.out.println("\nAnnotation Details");
	System.out.println("----------------");
	System.out.println("Course Id :"+crs.cid());
	System.out.println("Course Name :"+crs.cname());
	System.out.println("Course Addr :"+crs.ccos());
}
}
