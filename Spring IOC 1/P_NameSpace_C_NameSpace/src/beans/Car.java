package beans;

public class Car {
private String carname;
private Engine engine;


public void setCarname(String carname) {
	this.carname = carname;
}
public void setEngine(Engine engine) {
	this.engine = engine;
}
public void PrintData(){
	System.out.println();
	
	System.out.println(carname);
	System.out.println(engine.getModelyear());
}
}
