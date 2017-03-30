package S_29_3.NormalInnerClass;
/*with in the inner class(this) always refers current innerclass object.
 * if we want to refer current outerclass object we have to use
 * Outerclassname.this
*/

public class Outer1 {
int x=10;
class Inner{
	int x=100;
	public void m1(){
		int x=1000;
		System.out.println(x);
		//System.out.println(this.x);
		System.out.println(Inner.this.x);
		System.out.println(Outer1.this.x);

	}
}
public static void main(String[] args) {
	new Outer1().new Inner().m1();
}

}
