package S5_19_4.TestCollection3;

import java.util.ArrayList;
import java.util.Iterator;

public class TestCollection3 {

	public static void main(String[] args) {
		//creating user defined class objects
		Student s1=new Student(101,"venkat",23);
		Student s2=new Student(102,"Ravi",50);
		Student s3=new Student(103,"pavan",25);
		//creating arraylist
		ArrayList <Student> al=new ArrayList<Student>();
		al.add(s1);//adding Student class object.
		al.add(s2);
		al.add(s3);
		//getting Iterator
		Iterator itr=al.iterator();
		//traversing elements of arraylist object
		while(itr.hasNext()){
			Student st=(Student)itr.next();
			System.out.println(st.rollno+""+st.name+""+st.age);
		}
		
		
	}

}
