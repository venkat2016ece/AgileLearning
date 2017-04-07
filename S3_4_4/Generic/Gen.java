package S3_4_4.Generic;

public class Gen<T> {
	T ob;
	Gen(T o){
		ob=o;
	}
	T getOb(){
		System.out.println("Method getobject z type");
		return ob;
	}
	
	void showType(){
		System.out.println("Typ T to "+ob.getClass().getName());
	}
}
