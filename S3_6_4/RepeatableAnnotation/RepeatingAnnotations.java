package S3_6_4.RepeatableAnnotation;

public class RepeatingAnnotations {
	public static void main(String[] args) {
		Color[] colorArray=Shirt.class.getAnnotationsByType(Color.class);
		for(Color color:colorArray){
			System.out.println(color.name());
		}
	}

}
