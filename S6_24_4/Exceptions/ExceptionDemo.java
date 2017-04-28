package S6_24_4.Exceptions;

public class ExceptionDemo {
static void compute(int a) throws MyException{
	System.out.println("call compute("+a+")");
    if(a>10)
    	throw new MyException(a);
    System.out.println("no connection");
}
public static void main(String args[]){
	try{
		compute(1);
		compute(20);
	}catch(MyException e){
		System.out.println("error: "+e);
	}
}
}