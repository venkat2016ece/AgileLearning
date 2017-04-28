package S6_24_4.Exceptions;

public class ThrowDemo {
	static void demoproc() throws IllegalAccessException{
		
		throw new IllegalAccessException("demo");
	}
	public static void main(String[] args) {
			try{
				demoproc();
			}catch(IllegalAccessException e){
				System.out.println("Error e");
			}	}
	}


