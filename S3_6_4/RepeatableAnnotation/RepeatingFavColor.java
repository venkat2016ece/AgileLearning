package S3_6_4.RepeatableAnnotation;

public class RepeatingFavColor {
	public static void main(String[] args) {
		MyColor[] colorArray=FavColor.class.getAnnotationsByType(MyColor.class);
		for(MyColor venkat:colorArray){
			System.out.println(venkat.name());
		}
	}

}
