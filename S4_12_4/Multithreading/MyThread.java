package S4_12_4.Multithreading;

public class MyThread extends Thread{
	private int count;
	public MyThread(String name,int count)
	{
		super(name);//optional thread name
		this.count=count;
	}
	public void run(){
		for(int i=0;i<count;++i)
			System.out.println(getName());
	}

}
