package S4_13_4.NareshIT.MultipleUserThreads;

public class MyThread extends Thread{
int x;
public MyThread(){
x=5;
}
public MyThread(int x){
	this.x=x;
}
public void run(){
	for(int i=0;i<10;i++){
		System.out.println(getName()+"Run :"+i);
	}

}
public static void main(String[] args) {
	MyThread t1=new MyThread();
	t1.start();
	MyThread t2=new MyThread();
	t2.start();
	for(int i=0;i<10;i++){
		System.out.println("main thread"+i);
	}
}
}
