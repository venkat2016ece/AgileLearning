package S1_25_3.Classes;

import S1_25_3.Classes.AA.B;

public class StaticInnerClass {

	public static void main(String[] args) {
		AA a=new AA();
		B obj=new AA.B();
		obj.show();

	}

}
class AA{
	int roolno;
	String sname;
	
	static class B
	{
		public void show(){
			System.out.println("hello....");
		}
	}
}
