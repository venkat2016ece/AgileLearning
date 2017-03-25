package S1_25_3.Classes.AbstractClass;

public class Employee {
	private String name;
	private String adress;
	private int number;
	public Employee(String name,String address,int number){
		System.out.println("constructing an employee");
		this.name=name;
		this.adress=address;
		this.number=number;
	}
     public double compute(){
    	 System.out.println("Inside employee computePay");
    	 return 0.0;
     }
     public void mailCheak(){
    	 System.out.println("Mailing cheak to "+this.name);
     }
     public String toString(){
    	 return name+" "+ getAdress() +" "+number;
     }
	public void setAdress(String adress) {
		adress =new String();
	}
	public String getName() {
		return name;
	}
	public String getAdress() {
		return adress;
	}
	public int getNumber() {
		return number;
	}

}
