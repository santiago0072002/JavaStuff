import java.util.Arrays;
import java.util.Scanner; 

public class SourcesFile {

	public static void main(String[] args) {
	    System.out.println("   J    a   v     v  a ");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");
        

		
		/*
		 * lot of problems here: https://www.programming9.com/programs/java
		 * here too; https://www.includehelp.com/java-language-solved-programs.aspx
		 * sources for math problems with examples= https://www.javatpoint.com/java-math
		 * this teach you how to use Java stuff = https://www.w3schools.com/java/default.asp
		 * https://www.journaldev.com/1827/java-design-patterns-example-tutorial
		 * Java Dietel Book - http://www.most.gov.et/documents/470456/482033/java+how+to+program/32a8159f-25a4-dac4-dbeb-37faaedbf04f?version=1.0
		 * https://www.programiz.com/java-programming/examples
		 * Java Programs – 500+ Simple & Basic Programming With Outputs - https://javatutoring.com/java-programs/
		 * String Comparison - https://www.tutorialspoint.com/javaexamples/string_compare.htm
		 * Tutorialspoint.com is another good place to learn Java with lots of examples. 
		 * Docs oracle tutorial java - https://docs.oracle.com/javase/tutorial/java/javaOO/index.html
		 * 
		 * online documentation for class integer. http://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html (Deitel, 20190221, p. 82)
		 *  Array stuff. https://www.iitk.ac.in/esc101/05Aug/tutorial/java/data/arraybasics.html
		 *  
		 *  
		 * int[] n = new int[10]; // declare and create array of 10 elements called n. 
			n[2]= 10; // initialize element number 3 to 10 


		for (int i=0; i<n.length; i++) {			// print all elements of the array, the only one initialized is element number 3 to 10. so all of them when
		// i print them should print to zero because none are initialize. this is so awesome! 
		System.out.println(n[i]);
		}

		int y[]; // declare and integer array called y. 
		y = new int[10]; // create the array called y of 10 elements. 

	// below the next code is going to assign a value to each element of array y. 

		for (int i=0; i<y.length; i++) {
		y[i]=i; 								// assign each value of i to each element of array i and then print each element value in the line below. 
		System.out.println(y[i] + " ");

		 */
        
        // to convert string numbers to actuall ints or double check out the method type .parseInt or value of // source caleb tutorial 13
        // String.format basically does the samething as printf but using the println source = tutorial 14, caleb curry. 
        // the .lenght(); method return how many charachters are in a string for example if I saay String name = "hector" 
        // if i say name.lenght(); the number i should get back should be 5. \
        
        // int[] c = new int[ 12 ]; The following declaration and array-creation expression create an array object containing 12 int elements and store the array’s reference in array variable c:

        // secure random-numbers can be created as follows: SecureRandom randomNumbers = new SecureRandomw(); 
       /* int randomValue = randomNumbers.nextInt(); 
        *  int randomValue = randomNumbers.nextInt(2); // this produce 0 and 1
        *  array sources; https://www.w3schools.com/java/java_arrays.asp
        * 
        * Another way to create array is 
        * int[] c; // declare the array variable 
        * c=new int[ 12 ]; // create the array; assign to array variable
        * 
        * A program can create several arrays in a single declaration. 
        * The following declaration reserves 100 elements for b and 27 elements for x:
        * String[] b = new String[ 100 ], x =new String[ 27 ];
        * String[] b = new String[ 100 ]; // create array b 
        * String[] x = new String[ 27 ]; // create array x

Step 1 to create arrays. to create an array you say what type of inforamtion you want to store.then the name 
example int[] grades; 
        */
       //  int[] grades = new int[10]; 
        // grades[0]= 10; 
        
        // another way to declare an initialize the array is 
     //    int[] grades = {10,9,8,7,6,5,4,3,2,1}; 
     // System.out.println(Arrays.toString(grades));
        // to print all the elements of the array type Arrays.toString(nameofarray); 
        // lets make a new array of size to 
      //   sources for this is ; https://www.youtube.com/watch?v=r3GGV2TG_vw&list=PL_c9BZzLwBRKIMP_xNTJxi9lIgQhE51rF&index=1
     //    this piece of code lets me take input into an array then it lets me take information; 
        
        Scanner input = new Scanner(System.in); 
        int[] name = new int[10]; 
        for(int i=0; i<10; i++) {
        	System.out.println("Number "+ i );
        int x = input.nextInt(); 
        	name[i]=x; 
        	
           	
        }
        
        	System.out.println(Arrays.toString(name));
        	Arrays.sort(name); 
        	 System.out.println(Arrays.toString(name)); 
        // 	Array.parallelSort(name); also sort the arrays
        	 // to compare to see if arrays are equals you got to use the if (Arrays.equals( name1, name2)); 
	}

}
