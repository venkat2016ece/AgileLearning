package com.JunitExamples;


import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.BeforeClass;
import org.junit.Test;

public class TransformationServiceTest {
	private   TransformationService TransformationService;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		@SuppressWarnings("unused")
		TransformationService trnsfrmtionservice =new TransformationService(); 
	}

	 
	@Test
	public void test() throws ParseException {
		Object[] inputdata =new Object[]{new SimpleDateFormat("yyyy").parse("2012"),100};
		String pattren="yyyy-d-m";
		String expected = "ureka";
		System.out.println(inputdata + "\t "+pattren);
		String result=TransformationService.TransformData(inputdata, pattren);
		assertEquals("'2012-1-1',100", result);
	}
	

}
