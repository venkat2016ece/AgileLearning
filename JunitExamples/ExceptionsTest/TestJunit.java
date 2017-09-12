package com.JunitExamples.ExceptionsTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestJunit {

	String message = "Robert";	
	   MessageUtil messageUtil = new MessageUtil(message);
	   
	   @Test(expected = ArithmeticException.class)
	   public void testPrintMessage() {	
	      System.out.println("Inside testPrintMessage()");     
	      messageUtil.printMessage();     
	   }

	   @Test
	   public void testSalutationMessage() {
	      System.out.println("Inside testSalutationMessage()");
	      message = "Hi!" + "Robert";
	      assertEquals(message,messageUtil.salutationMessage());
	   }
}
