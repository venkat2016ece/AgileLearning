package S3_5_4.Generics;

public class Tray {
	public Glass<?> a;
	public void add(Glass<? extends Juice>glass){
		Glass<?> c;//local
	}
	public void remove(Glass<? super CokeZero> cokeGlass){
		
	}

}
