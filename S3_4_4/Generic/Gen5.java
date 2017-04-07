package S3_4_4.Generic;

public class Gen5<T extends Number> {
 T ob;
 
 T vals[];
 
 Gen5(T o,T[] nums){
	 vals =nums;
	 ob=o;
 }
}
