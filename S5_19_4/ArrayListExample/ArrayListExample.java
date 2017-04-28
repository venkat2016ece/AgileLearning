package S5_19_4.ArrayListExample;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		//creating list of books 
		List<Book> list=new ArrayList<Book>();
		//Creating list of books
		Book b1=new Book(101,"Let us C","yaswanth kanetkar","BPB",8);
		Book b2=new Book(102,"Data communications&networking","FOROUZEN","Mc Graw Hill",4);
	    Book b3=new Book(103,"Let us C","yaswanth kanetkar","BPB",6);
	    //Adding Books to list
	    list.add(b1);
	    list.add(b2);
	    list.add(b3);
	    //traversing list
	    for(Book b:list){
	    	System.out.println(b.id+""+b.name+""+b.author+""+b.publisher+""+b.quantity);
	    }
	    
	}

}
