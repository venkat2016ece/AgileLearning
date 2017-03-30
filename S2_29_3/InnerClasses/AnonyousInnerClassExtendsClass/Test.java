package S2_29_3.InnerClasses.AnonyousInnerClassExtendsClass;

public class Test {
		public static void main(String[] args) {
			PopCorn p=new PopCorn(){
				public void Taste(){
					System.out.println("spicy");
				}
			};
			p.Taste();//spicy
			PopCorn p1=new PopCorn();
			p1.Taste();//salty
			PopCorn p2=new PopCorn(){
				public void Taste(){
				System.out.println("sweet");
				}
			};
			p2.Taste();//sweet
			System.out.println(p.getClass().getName());
			System.out.println(p1.getClass().getName());
			System.out.println(p2.getClass().getName());
			
			
		}

}


