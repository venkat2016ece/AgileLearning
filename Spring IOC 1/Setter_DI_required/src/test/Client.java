package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Test;

public class Client {
	public static void main(String[] args) throws Exception {
		ApplicationContext ap=new ClassPathXmlApplicationContext("resources/spring.xml");
		Test t=(Test)ap.getBean("t");
		t.printConn(); 
		System.out.println("connected successsully");
	}
}
