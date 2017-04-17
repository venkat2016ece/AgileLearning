package S4_12_4.Multithreading;

public class Independent {

	public static void main(String[] args) {
		Thread t1=new MyThread("DesertTopping",8);
		Thread t2=new MyThread("FloorWax",4);
		t1.start();
		t2.start();
	}

}
