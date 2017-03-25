/**
 * 
 */
package S1_25_3.Classes.SigletonClass;

/**
 * @author welcome
 *
 */
public class Singleton {

	/**
	 * @param args
	 * Singleton:means one,that means you can create only one instance of the class.
1.you have to create static instance of the object.
2.create a private constructor.
3.create a static method.
	 */
	public static void main(String[] args) {
		Abc obj1=Abc.getInstance();
		Abc obj2=Abc.getInstance();
		 

	}

}
class Abc{
	static Abc obj=new Abc();//static instance of the object.
	private Abc(){
		//create a private constructor.
	}
	public static Abc getInstance(){//create a static method.
		return obj;
	}
}
