public class Calculate {
	
	/*
	 * Write a Java class called Calculate that calculates and prints the sum of the integers from 1 to 10. 
	 * Use a while statement to loop through the calculation and increment statements. 
	 * The program should contain a comment next to each increment statement. The loop should terminate when the value of x becomes 11.
	 * The program should output the final number formatted like this:
	 * The sum is: (whatever the number is).
	 * 
	 */

	public static void main(String[] args) {
	
	
	calculate(); // calling method calculatate

	}

	private static void calculate() {// there is Method calculate 
		
		int i = 1; // declaring a variable i to 1 
		int sum = 0; 
	
		while(i < 11) {
			
			System.out.println("The number now is "+ i +" Everytime the loop comes, it adds a number and sum it in the background");// the first time i is 1 
			
			sum+=i; // sum = sum + i 
			i++; // add 1 to i 
		
		}
		System.out.println();
		System.out.println("The sum from 1 to 10 is " + sum);// total displayed to the user. 
		
	}

}
