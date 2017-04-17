package S4_10_4.Multithreading.Priorities;

public class MyThread1 extends Thread{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("child Thread");
		}
		
	}

}
