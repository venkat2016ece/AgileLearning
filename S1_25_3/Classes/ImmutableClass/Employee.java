package S1_25_3.Classes.ImmutableClass;

public final class Employee {

  final String pancardNumber;
  /**
 * @param pancardNumber
 * In this example, we have created a final class named Employee.
 *  It have one final datamember, a parameterized constructor and getter method. 
 */
public Employee(String pancardNumber){
	  this.pancardNumber=pancardNumber;
	  
  }
public String getPancardNumber() {
	return pancardNumber;
}

}
