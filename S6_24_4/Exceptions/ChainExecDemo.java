package S6_24_4.Exceptions;

public class ChainExecDemo {
	static void demoproc(){
		
		NullPointerException e=new NullPointerException("the highest level");
		e.initCause(new ArithmeticException("reason"));
		throw e;
	}
	public static void main(String args[]){
		try{
			demoproc();
		}catch(NullPointerException e){
			System.out.println("exception --"+e+"\n");
			System.out.println("original cause"+e.getCause());
		}
	}

}
