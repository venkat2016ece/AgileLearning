package S2_1_4.Generics;

public class GenDemo {

	public static void main(String[] args) {
Gen<String> g1=new Gen<String>("venkat");
g1.show();
System.out.println(g1.getob());

Gen<Integer> g2=new Gen<Integer>(120);
g2.show();
System.out.println(g2.getob());

Gen<Double> g3=new Gen<Double>(102.3);
g3.show();
System.out.println(g3.getob());
 	}

}
