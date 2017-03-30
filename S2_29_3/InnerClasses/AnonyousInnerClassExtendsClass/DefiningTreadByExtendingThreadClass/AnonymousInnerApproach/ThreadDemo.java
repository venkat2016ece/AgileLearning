package S2_29_3.InnerClasses.AnonyousInnerClassExtendsClass.DefiningTreadByExtendingThreadClass.AnonymousInnerApproach;

public class ThreadDemo {
	public static void main(String[] args) {
		Thread t=new Thread(){
			public void run(){
				for(int i=0;i<10;i++){
					System.out.println("child class");
				}
			}
		};
		t.start();
		for(int i=0;i<10;i++){
			System.out.println("main thread");
		}
		
	}

}
