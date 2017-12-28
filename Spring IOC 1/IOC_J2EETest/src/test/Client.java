package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
	ApplicationContext ap=new ClassPathXmlApplicationContext("resources/spring.xml");
	//this aplicationcontext
	//check xml doucument
	//it will create instances for singleton beans
	ap.getBean("t");
	
		
	}

}
