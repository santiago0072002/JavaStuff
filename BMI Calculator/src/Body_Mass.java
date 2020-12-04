/* 
 * Name: Hector Santiago 
 * Date: 2020 AUG 04 
 * Desc: Instructions 
 * Draw a flowchart that calculates a person’s body mass index (BMI). 
 * BMI is a statistical measure that compares a person’s weight and height. 
 * The program uses three modules. The first prompts a user for and accepts the user’s height in inches. 
 * The second module accepts the user’s weight in pounds and converts the user’s height to meters and weight to kilograms.
 *  Then, it calculates BMI as weight in kilograms divided by height in meters squared, 
 *  and displays the results. 
 *  There are 2.54 centimeters in an inch, 100 centimeters in a meter, 453.59 grams in a pound, and 1,000 grams in a kilogram.
 */
import java.util.*;
import java.lang.Math;
import java.io.*; 
import java.lang.*; 
public class Body_Mass {
	
	public static void American() {
		double weight; 
		double height; 
	
	
		 Scanner input = new Scanner(System.in); 
		 System.out.println("Enter your Weight in pounds: ");
		 
		 weight = input.nextDouble();
		   
		  System.out.println("Enter your Height in Inches: ");
		   
		  height = input.nextDouble(); 
		  
		   
		   
	double bmi = (703 * weight)/Math.pow(height, 2); 
	
	
	System.out.printf("%.2f \n", bmi);
	//close scanner 
	
	 System.out.println("|               PROGRAM EXECUTED CORRECTLY           |");
	input.close();
	
		
	}
	public static void English() {
		
		double weight; 
		double height; 
	
	
		 Scanner input = new Scanner(System.in); 
		 System.out.println("Enter your Weight in kilos: ");
		  weight = input.nextDouble();
		   
		  
		  
		  System.out.println("Enter your Height in cm: ");
		  height = input.nextDouble(); 
		  
		  
		  
		  double kilos = weight; 
		  height = height / 100; 
		   
		   
		  double bmi = (kilos)/(Math.pow(height, 2)); 
	
	
	System.out.printf("%.2f \n", bmi);
	//close scanner 
	
	 System.out.println("|               PROGRAM EXECUTED CORRECTLY           |");
	input.close();
	
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 Scanner input = new Scanner(System.in); 
		 System.out.println("=================================================");
		 System.out.println("|                                                |");
		 System.out.println("|                                                |");
		 System.out.println("|          -----------------------------         |");
		 System.out.println("|            BMI Calculator                      |"); 
		 System.out.println("|          -----------------------------         |");
		 System.out.println("|                                                |");
		 System.out.println("|                                                |");
		 System.out.println("|                                                |");
		 System.out.println("=================================================");
		 
		 int user_input; 
		 
		 
		 
		 System.out.println("Enter 1 to use the American Way to calculate BMI or 2 for the English way  ");
		 user_input = input.nextInt();
		 
		 if (user_input == 1) {
			 American();  
		 }
		 else {
			 English(); 
		 }
		 input.close();
		 }
		 
		
		// in the Power method I the first number of the base and the second number is the power. 



}


