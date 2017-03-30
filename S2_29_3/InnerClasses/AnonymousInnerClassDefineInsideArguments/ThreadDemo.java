package S2_29_3.InnerClasses.AnonymousInnerClassDefineInsideArguments;

public class ThreadDemo {
public static void main(String[] args) {
	new Thread(new Runnable(){
		
	public void run()
	{for(int i = 0;i<10;i++){
		System.out.println("child thread");
	}}}).start();
	for(int i = 0;i<10;i++){
		System.out.println("main thread");
	}
}
}
