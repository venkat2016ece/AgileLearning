package S2_29_3.InnerClasses.AnonyousInnerClassExtendsClass.AnonymousInnerClassThatImplementsAnInterface.AnonymousInnerClassApproach;

public class TreadDemo {
public static void main(String[] args) {
	Runnable r=new Runnable(){
		public void run(){
			for(int i = 0;i<10;i++){
				System.out.println("child thread");
			}
		}
	};
	Thread t=new Thread(r);
	t.start();
	for(int i = 0;i<10;i++){
		System.out.println("main thread");
	}
}
}
