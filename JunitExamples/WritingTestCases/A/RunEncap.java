package com.JunitExamples.WritingTestCases.A;

 
 

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RunEncap {
	EncapTest encap=new EncapTest();
	@Test
	public  void empMethod() {
		encap.setName("James");
		encap.setAge(20);
		encap.setIdNum("12343");
System.out.println("NAME :"+encap.getName()+"\n \n  Age: "+encap.getAge());
				assertEquals(20, 20);
	}

	
}
