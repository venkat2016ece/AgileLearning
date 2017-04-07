package S3_4_4.Annotations;

import java.lang.reflect.Method;

/*
 * This Class demonstrates use of Todo annotation defined in Todo.java
 * 
 * @test
 * 
 * @version 1.0
 * 
 */


public class BusinessLogic {
    public BusinessLogic() {
        super();
    }
    
    public void compltedMethod() {
        System.out.println("This method is complete");
    }    
    
    @Todo(priority = Todo.Priority.HIGH)
    public void notYetStartedMethod() {
        // No Code Written yet
    	// should output  priority - high
    	Class businessLogicClass = BusinessLogic.class;
    	for(Method method : businessLogicClass.getMethods()) {
    	Todo todoAnnotation = (Todo)method.getAnnotation(Todo.class);
    	if(todoAnnotation != null) {
    	System.out.println("notYetStartedMethodpriority:"+todoAnnotation.priority());
    	}

    	}
    }
    
    @Todo(priority = Todo.Priority.MEDIUM, author = "Uday", status = Todo.Status.STARTED)
    public void incompleteMethod1() {
        //Some business logic is written
        //But its not complete yet
    	// should output priority - medium, author - uday status - started
    	Class businessLogicClass = BusinessLogic.class;
    	for(Method method : businessLogicClass.getMethods()) {
    	Todo todoAnnotation = (Todo)method.getAnnotation(Todo.class);
    	if(todoAnnotation != null) {
    	System.out.println(" incompleteMethod1Author : " + todoAnnotation.author());
    	System.out.println(" incompleteMethod1Priority: " + todoAnnotation.priority());
    	System.out.println(" incompleteMethod1Status: " + todoAnnotation.status());
    	}
    	}
    }

    @Todo(priority = Todo.Priority.LOW, status = Todo.Status.STARTED )
    public void incompleteMethod2() {
        //Some business logic is written
        //But its not complete yet
    	// should output prioritiy - low, status - started
    	Class businessLogicClass = BusinessLogic.class;
    	for(Method method : businessLogicClass.getMethods()) {
    	Todo todoAnnotation = (Todo)method.getAnnotation(Todo.class);
    	if(todoAnnotation != null) {
    	System.out.println(" incompleteMethod2Priority : " + todoAnnotation.priority());
    	System.out.println(" incompleteMethod2Status : " + todoAnnotation.status());
    	}
    	}
    }
    
    public static void main(String args[]){
    	
    	BusinessLogic logic = new BusinessLogic();
    	logic.compltedMethod();
    	logic.notYetStartedMethod();
    	logic.incompleteMethod1();
    	logic.incompleteMethod2();
    	
    }
}
