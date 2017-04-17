package S4_13_4.NareshIT.java9s.A;

public class RaceDemo {

	public static void main(String[] args) {
		Racer racer=new Racer();
		Thread runner1=new Thread(racer," venkat ");
		Thread runner2=new Thread(racer," naresh ");
		Thread runner3=new Thread(racer," sandeep ");
		Thread runner4=new Thread(racer," suresh ");
		Thread runner5=new Thread(racer," ramesh ");
		Thread runner6=new Thread(racer," mallesh ");
		Thread runner7=new Thread(racer," vivaan ");
		Thread runner8=new Thread(racer," laxman ");
		Thread runner9=new Thread(racer," nishanth ");
		Thread runner10=new Thread(racer," prashanth ");
		//race to start tell threads to start
		runner1.start();
		runner2.start();
		runner3.start();
		runner4.start();
		runner5.start();
		runner6.start();
		runner7.start();
		runner8.start();
		runner9.start();
		runner10.start();
	}

}
