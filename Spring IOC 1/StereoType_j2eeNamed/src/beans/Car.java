package beans;

import javax.annotation.Resource;

public class Car {
	@Resource
	private Engine engine;
	
public void printEng(){
	System.out.println("EngName="+engine.getEngname());
	
}
}
