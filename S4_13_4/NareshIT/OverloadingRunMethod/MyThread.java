package S4_13_4.NareshIT.OverloadingRunMethod;
/*
 * we can overload run method but thread class start() method will always call 
 * no argument run method() only 
 * 
 * the other overloaded method we have to call explicitly will be exicuted just like 
 * a normal call method*/

public class MyThread  extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("child Thread");
		}
	}
	public void run(int a){
		for(int i=0;i<10;i++){
			System.out.println("int argument");
		}
	}
}
