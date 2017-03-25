package S1_25_3.Classes;

public class InnerClass {

	public static void main(String[] args) {
		A a=new A();
		A.B obj=a.new B();
		obj.show();
		 

	}

}
class A{
	int roolno;
	String sname;
	class B{
		public void show(){
			System.out.println("Hello......");
		}
	}
}
