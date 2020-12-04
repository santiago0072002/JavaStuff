package addstuff;

import java.util.Scanner;

public class AddMe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in); // declare my scanner. 
		
		System.out.println("please enter the first number"); // prompt
		int number1 = input.nextInt();
		
		System.out.println("please enter the second number");
		int number2 = input.nextInt();
		int [] myNumbers; // declare the array
		
		myNumbers=calculate(number1, number2); // whatever comes out the function calculate will be assign to the array calling it. 
		// basically we are initializing the array with the method called
		for (int i = 0; i < myNumbers.length; i++) { // this for loop is going to display the array called myNumbers that got the numbers from the method called. 
			System.out.println(myNumbers[i]); // think of i as a element position. So myNumbers[0];  
		}									// using the debugger is a good way to understand loops. research the step over from the debugger 
		input.close(); // closing the scanner 
	}

	private static int[] calculate(int num1, int num2) { // this function is going to return an array of integers
		int[] result= new int[4]; // declare array result and save 4 spots for numbers to be added to the array. 
		
		result[0]= num1 + num2; // first element add
		result[1]= num1 - num2; // second substract
		result[2]= num1 * num2; // third mult
		result[3]= num1 / num2; // fourth one div this might generate a div by zero error though 
	
	        
	       
		
		// Arrays.sort(result); 
		
		return result; // return the array 
		
		
	}

}
