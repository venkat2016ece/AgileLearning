package S2_29_3.InnerClasses.AnonyousInnerClassExtendsClass.DefiningTreadByExtendingThreadClass.NormalClassApproach;

public class myTread extends Thread {
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("child thread");
		}	}

}
