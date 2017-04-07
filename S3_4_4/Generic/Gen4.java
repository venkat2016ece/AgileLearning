package S3_4_4.Generic;

public class Gen4 extends Gen<String>{
	Gen4(String o){
		super(o);
	}
String getOb(){
	System.out.println("method string getObject");
	return ob;
}
}
