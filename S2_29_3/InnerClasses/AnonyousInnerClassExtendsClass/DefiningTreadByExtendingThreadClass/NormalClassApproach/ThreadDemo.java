package S2_29_3.InnerClasses.AnonyousInnerClassExtendsClass.DefiningTreadByExtendingThreadClass.NormalClassApproach;

class ThreadDemo {
public static void main(String[] args) {
	myTread t=new myTread();
	t.start();
	for(int i = 0;i<10;i++){
		System.out.println("main thread");
	}
}
}
