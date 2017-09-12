package com.JunitExamples.WritingTestCases.A;

public class TestClient {

	public static void main(String[] args) {
		EmpBean eb1=new EmpBean();
		eb1.setEid(111);
		eb1.setEname("venkat");
		
		int eid=eb1.getEid();
		String ename=eb1.getEname();
		System.out.println(eid);
		System.out.println(ename);
		
		 
		
		
		
		EmpBean eb2=new EmpBean();
		eb2.setEid(222);
		eb2.setEname("VENKY");
		System.out.println(eb2.getEid());
		System.out.println(eb2.getEname());
	}

}
