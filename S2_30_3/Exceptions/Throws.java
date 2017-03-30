package S2_30_3.Exceptions;

public class Throws {
	void mro() throws InterruptedException
	{
		System.out.println("sleeping mode");
		Thread.sleep(3000);
		System.out.println("sleeping mode");
	}
		void mofficer() throws InterruptedException
		{mro();
			}
		void eseva()
		{try{
		     mofficer();
			}catch(InterruptedException ie){
				ie.printStackTrace();
			}
			}
		public static void main(String[] args) {
			Throws t=new Throws();
			t.eseva();
		}
		}
		


