package S3_4_4.Generic;

public class Gen3<T> extends Gen<T> {
Gen3(T o){
	super(o);
}
T getOb(){
	System.out.println("Method getob() in Gen3");
	return ob;
}
}
