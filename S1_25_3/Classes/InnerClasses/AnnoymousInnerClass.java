package S1_25_3.Classes;

public class AnnoymousInnerClass {

	public static void main(String[] args) {
		B obj=new B(){
			public void show(){
				System.out.println("hai......");
			}
			
		};
		obj.show();
		 

	}

}
 
	class B{
		public void show(){
			System.out.println("Hello......");
		}
	}

