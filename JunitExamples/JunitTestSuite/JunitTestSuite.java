package com.JunitExamples.JunitTestSuite;

import com.JunitExamples.JunitAPI.TestJunit1;
import com.JunitExamples.JunitAPI.TestJunit2;
import com.JunitExamples.JunitAPI.TestJunit3;

import junit.framework.TestResult;
import junit.framework.TestSuite;

public class JunitTestSuite {
	public static void main(String[] a) {
	      // add the test's in the suite
	      TestSuite suite = new TestSuite(TestJunit1.class, TestJunit2.class, TestJunit3.class );
	      TestResult result = new TestResult();
	      suite.run(result);
	      System.out.println("Number of test cases = " + result.runCount());
	   }

}
