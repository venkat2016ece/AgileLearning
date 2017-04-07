package S3_5_4.Generics;

public class Guest2 {
	 public static void main(String[] args) {
		 Tray t= new Tray();
		 /*upper bounded allows only all the subclass which are having is a relationship*/
		 t.add(new Glass<OrangeJuice>());
		 //t.add(new Glass<Liquid>());it is(Liquid)on top of Juice class thats why it is not allowing
		 
		 
		 /* Lower bounded wild card*/
		 //t.remove(new Glass <CokeGreen>());it is not a super class of cokezero.
	//t.remove(new Glass<CokeXtra>());it is under cokezero.
		 //so its accept only all the super classes of cokezero and cokezero as a argument.
		 t.remove(new Glass<CokeZero>());
	 }

}
