package S3_5_4.Generics;

public class Guest {
	public static void main(String[] args) {
		Glass<Juice> g=new Glass<Juice>();
		Juice juice=new Juice();
		g.liquid=juice;
																											
	
		Glass<Water> waterGlass=new Glass<Water>();
		waterGlass.liquid=new Water();
		//Retrieve 
		Juice j=g.liquid;
		Water water=waterGlass.liquid;
		
		
		Color<Red,Green,Blue> color=new Color<Red,Green,Blue>();
		
		Bartender bartender=new Bartender();
		bartender.<Juice,Water>mix(juice, water);
		
		Glass2<OrangeJuice> orangeJuice=new Glass2<OrangeJuice>();
		//Glass2<AppleJuice> appleJuice=new Glass2<AppleJuice>()
		//it doesn't implement liquid interface the compiler  wont allow to use as a type argument 
		
		Glass<Juice> liquidGlass=new WineGlass<Juice>();
		//Glass<Liquid> liquidGlass=new WineGlass<Juice>();
	}

}
