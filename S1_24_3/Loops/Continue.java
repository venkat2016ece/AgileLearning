package S1_24_3.Loops;

public class Continue {

	public static void main(String[] args) {
		int i;
		for(i=0;i<=20;i++){
			if(i==5||i==7){
				System.out.println("skipping from the disply using continue statement\n"+i);
				continue;
			}
			System.out.println("i values:::"+i);
		}

	}

}
