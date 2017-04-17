package S4_13_4.NareshIT.java9s;

public class Racer implements Runnable {
	public static String winner;
	public void Race(){
		for(int distance=1;distance<=100;distance++){
			System.out.println("Distance coverd by"+Thread.currentThread().getName()+"is:"+distance+"meteres");
			//check if Race is complete if someone has already won
			boolean isRaceWon=this.isRaceWon(distance);
			if(isRaceWon){
				break;
			}
		}
		
	}
	private boolean isRaceWon(int totalDistanceCovered){
		boolean isRaceWon=false;
		if(Racer.winner==null&&(totalDistanceCovered==100)){
			String winnername=Thread.currentThread().getName();
			Racer.winner=winnername;//setting the winnername
			System.out.println("Winner is:"+Racer.winner);
			isRaceWon=true;
		}else if(Racer.winner==null){
			isRaceWon=false;
		}else if(Racer.winner!=null){
			isRaceWon=true;
		}
		return isRaceWon;
	}

	@Override
	public void run() {
		this.Race();
	}

}
