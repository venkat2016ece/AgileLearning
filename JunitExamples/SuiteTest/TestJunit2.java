package com.JunitExamples.SuiteTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestJunit2 {
	String message = "Robert";	
	   MessageUtil messageUtil = new MessageUtil(message);
	 
	   @Test
	   public void testSalutationMessage() {
	      System.out.println("Inside testSalutationMessage()");
	      message = "Hi!" + "Robert";
	      assertEquals(message,messageUtil.salutationMessage());
	   }

}
