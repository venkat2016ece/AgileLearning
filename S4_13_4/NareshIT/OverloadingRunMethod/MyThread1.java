package S4_13_4.NareshIT.OverloadingRunMethod;
/*
 * we are overriding run method
 * if we are not overriding run method then the thread class run method will 
 * be exicuted wich has empty implementation
 * hence we dont get any output*/

public class MyThread1 extends Thread {
	public void run(int a){
		for(int i=0;i<10;i++){
			System.out.println("int argument");
		}
	}

}
