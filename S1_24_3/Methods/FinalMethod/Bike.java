package S1_24_3.Methods.FinalMethod;

class Bike{
	   final void run(){System.out.println("running");}
	}
	   
	class Honda extends Bike{
	   void run(){System.out.println("running safely with 100kmph");}
	   
	   public static void main(String args[]){
	   Honda honda= new Honda();
	   honda.run();
	   
	   }
	}
	
	

	
	
	/*
	 * 
	 * 
	 * Compile by: javac Honda.java
232.62/Honda.java:6: error: run() in Honda cannot override run() in Bike
ng safely with 100kmph");}
^
overridden method is final
1 erro*/
	 */