package S2_29_3.InnerClasses.AnonyousInnerClassExtendsClass.AnonymousInnerClassThatImplementsAnInterface.NormalClassApproach;

public class ThreadDemo {
	public static void main(String[] args) {
		myRunnable r=new myRunnable();
		Thread t=new Thread();
				t.start();
		for(int i = 0;i<10;i++){
			System.out.println("main thread");
		}
	}

}
