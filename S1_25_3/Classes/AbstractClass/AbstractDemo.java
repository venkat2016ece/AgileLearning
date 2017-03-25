package S1_25_3.Classes.AbstractClass;

public class AbstractDemo {

	public static void main(String[] args) {
		Salary s=new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
		Employee e=new Salary("John Adams", "Boston, MA", 2, 2400.00);
System.out.println("call mail Cheak using salary reference-----");
s.mailcheak();
System.out.println("\n call mail cheak using mail reference");
e.mailCheak();
	}

}
