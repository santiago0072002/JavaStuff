/* Name: Hector Santiago

The program calculates the diameter by multiplying the radius by 2, 
and then calculates the circumference by multiplying the diameter by 3.14. 
The program outputs both the diameter and the circumference.

*/ 


import java.util.Scanner;

public class CalculateAreaAndDiameter {

	public static void main(String[] args) {
		// Declarations: 
		 	float r; // declare a variable float 
	        double circumfedence, diameter; // declared two variables doubles. 
	        Scanner scan = new Scanner(System.in); // got to get better at using the scanner. 
	      
	      // input
	        
	        System.out.print("Enter Radius of Circle : "); // this line tells the user to enter the radius
	        r = scan.nextFloat();							// this is the variable to hold space in memory for user input
			
	     // process 
	        diameter = 2*r;									// calculations
	        circumfedence = 3.14*diameter;
	        
	      //output
	        System.out.printf("The Area of Circle = %f);", circumfedence); 		//output
	        System.out.print("\nThe Diameter of Circle = " + diameter); 
	        
	        scan.close(); // closing my scanner
		
		//output

	}

}
