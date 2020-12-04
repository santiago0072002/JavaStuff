import java.util.List; 
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List; 
public class ArrayList1 {

	public static void main(String[] args) {
	ArrayList1 myList= new ArrayList1(); 
	
	 ArrayList cars = new ArrayList();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    System.out.println(cars);
	    
	    List<Integer> grades = new LinkedList<Integer>(); 
	    grades.add(5); 
	    grades.add(10); 
	    grades.add(1,7); 
	    
	    System.out.println(grades.get(2));// this is going to print the value from the array list element 2 (array get value of element 2 of array grades. 
	    System.out.println(grades.contains(7));// this is a true or false value and it is asking if the array list grades contains the value 7 
	    System.out.println(grades.indexOf(10)); // this shows the element of the value 10, right now is in element 2. 
	    // you can also clear all elements of the array by using the clear method(); 
	}
	


}
