package S1_24_3.Methods.PassByValue;
/*whenever we call a method in our program,if the parameters of that method 
 * are gonna be java primitive types(int,char float,double,boolean,string,long)
 * at that time values are gonna be passed by value 
 * 2.it means values of that arguments are gonna be copied to that method parameters.
 * **/

public class PassByValue {

	public static void main(String[] args) {
		int number=25;
		System.out.println("before calling the diplay method="+number);
		display(number);
		System.out.println("after calling the diplay method="+number);
		

	}
	public static void display(int num){
		System.out.println("inside the diplay method="+num);
		num=100;
		System.out.println("inside the diplay method="+num);
	}

}
