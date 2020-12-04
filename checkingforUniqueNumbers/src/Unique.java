import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Unique {

	public static void getNumbers() throws InputMismatchException {
		 
        ArrayList<Integer> list = new ArrayList<Integer>(); // best option in my opinion for this problem. the time is O(N) as the numbers increase then it is going to take to take longer. 
  
        Scanner input = new Scanner(System.in); // this is my scanner 
        int x = 1; // sentinel value to start and get out of the loop
        
       do {
			try { // just in case something out the normal happens, I hope the catch block do the job. 
						System.out.println("please enter a number in between 10 and 100 to either add it to the list or throw it out");
						if(input.hasNextInt()) { // if the input entered to the list is an integer then it goes in the code otherwise it goes somewhere else
							
						int number = input.nextInt();	// assign number to scanner only and if only the number is an integer							
						
						if(number >= 10 && number <= 100) // if the number if in between 10 and 100 the number goes here 
										{
						
										if (list.contains(number)==true) // if the list contains what the user entered number does not go in the list
											{
											    System.out.println("this number is already in the list");
											System.out.println("You entered "+  number + " though");
											System.out.println("so far the numbers in the list are " + list.toString());
											    
											}
										else if(list.contains(number)==false) // if the number that the user entered is not in the list then add it to the list in the block below
												{
											    list.add(number); // add number to the list
											    System.out.println("adding " + number + " to the list"); // this is just to make it fancy telling the user the number is getting added
											    System.out.println(list.toString()); // this is going to show the user the numbers in the list
											    System.out.println(number + " has been added!");// more fancy stuff telling the user that the number has been added
													if (list.size()== 5) // once the list has 5 numbers the change the value of x to 2 and break the loop 
														{
													    x=2; // sentinel value to break the loop
													    }
												}
										}
						else { // this else is going to take all numbers that are not in between 10 and 100. 
						System.out.println("This number is either less than 10 or greater than 100 the number is : "+ number );
						}
			} else{ // if the input is not an integer it going to get place here in this block. because it is inside of the loop the program is going to keep going. 
	            input.nextLine();
	            System.out.println("Enter a valid Integer value");
	        } // end of else block from line 46
						
			}// end of tryblock from line 15
		catch(InputMismatchException inputMismatchException) 
			{
				System.err.print("Please enter the right stuff Exception " + inputMismatchException);
			} // end of catch block 
		
       } while(x == 1); // end of the while loop 
       System.out.println("Thank you for playing the game: all five numbers are unique."); // special message saying the game is over only and if only the user entered 5 numbers into the list. 
       input.close(); // closing my input scanner
}
		
	}


