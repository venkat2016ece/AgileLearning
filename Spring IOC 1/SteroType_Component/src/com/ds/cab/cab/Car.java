package com.ds.cab.cab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ds.cab.eng.Engine;
@Component
public class Car {
	@Autowired
	private Engine engine;
	
	public void printEngData(){
		System.out.println("EngName:"+engine.getEngname());
	}

}
