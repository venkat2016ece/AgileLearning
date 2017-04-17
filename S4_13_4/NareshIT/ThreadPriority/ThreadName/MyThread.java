package S4_13_4.NareshIT.ThreadPriority.ThreadName;

public class MyThread extends Thread {
	public MyThread(){
		super();
	}
		public MyThread(String name){
			super(name);
		}
		public void run(){
			for(int i=0;i<3;i++){
				try{
					Thread.sleep(500);
				}catch(Exception e){
					System.out.println(getName()+"i:"+i);
				}
			}

		}
	}
